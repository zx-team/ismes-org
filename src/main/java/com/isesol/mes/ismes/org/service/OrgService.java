package com.isesol.mes.ismes.org.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

import com.google.common.collect.Maps;
import com.isesol.ismes.platform.core.service.bean.Dataset;
import com.isesol.ismes.platform.module.Bundle;
import com.isesol.ismes.platform.module.Parameters;
import com.isesol.ismes.platform.module.Sys;

public class OrgService {

	public void initOrgData(Parameters parameters, Bundle bundle) {
		Map<String, Object> data1 = Maps.newHashMap();
		data1.put("zzjgmc", "一车间");    // 组织机构名称
		data1.put("zzjgbm", "yichejian"); // 组织机构编码
		data1.put("zzjglx", "org_cjxx"); // 组织机构类型
		data1.put("glgxid", 0); // 关联关系ID
		data1.put("fjdid", 0); // 父节点ID
		Sys.insert("org_zzjgxxb", data1);
	}
	
	public void listCj(Parameters parameters, Bundle bundle) {
		Dataset dataset = Sys.query("org_zzjgxxb", "zzjgid, zzjgmc", "zzjglx=?", null, null, "org_cjxx");
		bundle.put("data", dataset.getList());
	}
	
	/**
	 * 根据组织机构id列表查询组织结构信息
	 * @param parameters
	 * @param bundle
	 */
	public void listCjByzzjglist(Parameters parameters, Bundle bundle) {
		String zzjgList = (String) parameters.get("zzjg");
		Dataset dataset = Sys.query("org_zzjgxxb", "zzjgid, zzjgmc", "zzjglx=? and zzjgid in " + zzjgList, null, null, "org_cjxx");
		bundle.put("data", dataset.getList());
	}
	
	public void getOrgNameById(Parameters parameters, Bundle bundle) {
		String id = parameters.getString("id");
		Dataset dataset = Sys.query("org_zzjgxxb", "zzjgmc", "zzjgid = ? ", null, null, id);
		if(dataset != null && MapUtils.isNotEmpty(dataset.getMap())){
			Map<String,Object> map = dataset.getMap();
			if(map.get("zzjgmc") != null){
				String name = String.valueOf(map.get("zzjgmc"));
				bundle.put("name", name);
			}
		}
	}
	
	public void listCjQuery(Parameters parameters, Bundle bundle) {
		String condition = " zzjglx= 'org_cjxx' " ;
		List<Object> values = new ArrayList<Object>();
		if(parameters.get("zzjgmc") != null){
			String zzjgmc = (String) parameters.get("zzjgmc");
			condition = condition + " and zzjgmc like  ? ";
			values.add(new String("%"+zzjgmc+"%"));
		}
		Dataset dataset = Sys.query("org_zzjgxxb", "zzjgid, zzjgmc", condition , null, null, values.toArray());
		bundle.put("data", dataset.getList());
	}
	
}
