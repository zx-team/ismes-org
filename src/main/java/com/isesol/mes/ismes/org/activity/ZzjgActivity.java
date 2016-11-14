package com.isesol.mes.ismes.org.activity;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.isesol.ismes.platform.core.service.bean.Dataset;
import com.isesol.ismes.platform.module.Bundle;
import com.isesol.ismes.platform.module.Parameters;
import com.isesol.ismes.platform.module.Sys;

import net.sf.json.JSONObject;

public class ZzjgActivity {

	public String index(Parameters parameter, Bundle bundle) {
		StringBuffer sb = new StringBuffer();
		sb.append("{");
//		sb.append("\"org_gcxxb\":{\"type\":\"org_gcxxb\",\"label\":\"工厂\",\"description\":\"工厂结点说明\",\"image\":\""+Sys.getResourceUrl("org","org_gcxxb")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"ctime\",\"label\":\"建厂日期\",\"type\":\"date\",\"validate\":{\"required\":true},\"opts\":{");
		//sb.append("   format: 'yyyy-mm-dd'");
//		sb.append("       }},{\"name\":\"description\",\"label\":\"简介\",\"type\":\"longtext\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"building\":{\"type\":\"building\",\"label\":\"楼房\",\"description\":\"楼房\",\"image\":\""+Sys.getResourceUrl("org","building")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("      \"bus-turn\":{\"type\":\"bus-turn\",\"label\":\"公交车\",\"description\":\"公交车\",\"image\":\""+Sys.getResourceUrl("org","bus-turn")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("      \"bus\":{\"type\":\"bus\",\"label\":\"公交车\",\"description\":\"公交车\",\"image\":\""+Sys.getResourceUrl("org","bus")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("      \"car\":{\"type\":\"car\",\"label\":\"工厂\",\"description\":\"小汽车\",\"image\":\""+Sys.getResourceUrl("org","car")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"flag\":{\"type\":\"flag\",\"label\":\"标识\",\"description\":\"标识\",\"image\":\""+Sys.getResourceUrl("org","flag")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"ground-grass\":{\"type\":\"ground-grass\",\"label\":\"草地\",\"description\":\"草地\",\"image\":\""+Sys.getResourceUrl("org","ground-grass")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"ground\":{\"type\":\"ground\",\"label\":\"土地\",\"description\":\"土地\",\"image\":\""+Sys.getResourceUrl("org","ground")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"light\":{\"type\":\"light\",\"label\":\"灯\",\"description\":\"灯\",\"image\":\""+Sys.getResourceUrl("org","light")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"longflag\":{\"type\":\"longflag\",\"label\":\"长标识\",\"description\":\"长标识\",\"image\":\""+Sys.getResourceUrl("org","longflag")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("      \"stones\":{\"type\":\"stones\",\"label\":\"石头\",\"description\":\"石头\",\"image\":\""+Sys.getResourceUrl("org","stones")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("      \"trash\":{\"type\":\"trash\",\"label\":\"垃圾桶\",\"description\":\"垃圾桶\",\"image\":\""+Sys.getResourceUrl("org","trash")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("     \"tree-big\":{\"type\":\"tree-big\",\"label\":\"大树\",\"description\":\"大树\",\"image\":\""+Sys.getResourceUrl("org","tree-big")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
		sb.append("     \"org_gcxxb\":{\"type\":\"org_gcxxb\",\"label\":\"工厂\",\"description\":\"工厂\",\"image\":\""+Sys.getResourceUrl("org","org_gcxxb")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"zzjgms\",\"label\":\"组织机构描述\",\"type\":\"longtext\",\"validate\":{\"required\":true}},{\"name\":\"zzjgbm\",\"label\":\"组织机构编码\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
		sb.append("     \"org_jtxxb\":{\"type\":\"org_jtxxb\",\"label\":\"集团\",\"description\":\"集团\",\"image\":\""+Sys.getResourceUrl("org","org_jtxxb")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"zzjgms\",\"label\":\"组织机构描述\",\"type\":\"longtext\",\"validate\":{\"required\":true}},{\"name\":\"zzjgbm\",\"label\":\"组织机构编码\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
		sb.append("     \"org_cjxx\":{\"type\":\"org_cjxx\",\"label\":\"车间\",\"description\":\"车间\",\"image\":\""+Sys.getResourceUrl("org","org_cjxx")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"zzjgms\",\"label\":\"组织机构描述\",\"type\":\"longtext\",\"validate\":{\"required\":true}},{\"name\":\"zzjgbm\",\"label\":\"组织机构编码\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
		sb.append("     \"org_bmxxb\":{\"type\":\"org_bmxxb\",\"label\":\"部门\",\"description\":\"部门\",\"image\":\""+Sys.getResourceUrl("org","org_bmxxb")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"zzjgms\",\"label\":\"组织机构描述\",\"type\":\"longtext\",\"validate\":{\"required\":true}},{\"name\":\"zzjgbm\",\"label\":\"组织机构编码\",\"type\":\"text\",\"validate\":{\"required\":true}}]},");
//		sb.append("       \"tree\":{\"type\":\"tree\",\"label\":\"树\",\"description\":\"树\",\"image\":\""+Sys.getResourceUrl("org","tree")+"\",\"attributes\":[{\"name\":\"name\",\"label\":\"名称\",\"default\":\"\",\"type\":\"text\",\"validate\":{\"required\":true}},{\"name\":\"location\",\"label\":\"位置\",\"type\":\"text\",\"validate\":{\"required\":true}}]}  ");     
		sb.append("}");
		bundle.put("nodes", sb.toString());
		bundle.put("toolBtns", "[\"cursor\",\"direct\",\"|\",\"org_jtxxb\",\"org_gcxxb\",\"org_cjxx\",\"org_bmxxb\",\"|\",\"group\"]");
		try {
			BufferedReader tBufferedReader = new BufferedReader(new InputStreamReader(Sys.readFile("/zzjg/zzjg")));
			StringBuffer tStringBuffer = new StringBuffer();
			String sTempOneLine = new String("");
			while ((sTempOneLine = tBufferedReader.readLine()) != null){
				tStringBuffer.append(sTempOneLine);
			}
			bundle.put("data",JSONObject.fromObject(tStringBuffer.toString()));
		} catch (Exception e) {
			System.out.println("未读取到文件");
		}
		
		return "org_zzjg";
	}
	
	/**保存组织机构
	 * @param parameter
	 * @param bundle
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String saveZzjg(Parameters parameter, Bundle bundle) throws Exception {
		if(null!=parameter.get("e_data"))
		{
			List<Map<String,Object>> zzjg_inlist = new ArrayList<Map<String,Object>>();
			Map<String, Object> map = new HashMap<String, Object>(); 
			Map<String, Object> nodes = new HashMap<String, Object>(); 
			Map<String, Object> lines = new HashMap<String, Object>(); 
			Map<String, Object> nodeValue = new HashMap<String, Object>(); 
			Map<String, Object> lineValue = new HashMap<String, Object>(); 
			Map<String, Object> attributes = new HashMap<String, Object>(); 
			Map<String, Object> node = new HashMap<String, Object>();
			
		
			//保存进数据库
			map = JSONObject.fromObject(parameter.get("e_data"));
			nodes = (Map<String, Object>) map.get("nodes");
			
			//读取节点数据
			Iterator itnode = nodes.entrySet().iterator();
			while (itnode.hasNext())
			{
				node = new HashMap<String, Object>(); 
				Map.Entry entry = (Map.Entry) itnode.next() ;
				nodeValue = (Map<String, Object>) entry.getValue() ;
				attributes = (Map<String, Object>) nodeValue.get("attributes");
				node.put("txbjqjdmc", entry.getKey().toString());
				node.put("zzjglx",nodeValue.get("type").toString());
				node.put("zzjgmc", attributes.get("name"));
				node.put("zzjgms", attributes.get("zzjgms"));
				if(null==attributes.get("zzjgbm"))
				{
					bundle.put("msg", "组织结构编码空，保存失败");
					return "json:msg";
				}
				node.put("zzjgbm", attributes.get("zzjgbm"));
				node.put("from", ""); 
				node.put("fjdid", ""); 
				zzjg_inlist.add(node);
			}
		
			
			//读取连线数据
			lines = (Map<String, Object>) map.get("lines");
			Iterator itline = lines.entrySet().iterator();
			while (itline.hasNext())
			{
				Map.Entry entry = (Map.Entry) itline.next() ;
				lineValue = (Map<String, Object>) entry.getValue() ;
				for (int j = 0; j < zzjg_inlist.size(); j++) {
					if (zzjg_inlist.get(j).get("txbjqjdmc").equals(lineValue.get("to"))) {
						zzjg_inlist.get(j).put("from", lineValue.get("from"));
					}
				}
			}
			
			
			String val_txbjqjdmc = "(";
			
			//判断根节点个数
			int n = 0;
			for (int j = 0; j < zzjg_inlist.size(); j++) {
				if(StringUtils.isBlank(zzjg_inlist.get(j).get("from").toString())) {
					n++;
					if(n>1)
					{
						bundle.put("msg", "请确保只有一个根节点");
						break;
					} 
				}
				
				if(j!=0)
				{
					val_txbjqjdmc = val_txbjqjdmc +",";
				}
				val_txbjqjdmc += "'" +zzjg_inlist.get(j).get("txbjqjdmc")+"'";
			}
			val_txbjqjdmc = val_txbjqjdmc +")";
			
			
			//如果只有一个根节点
			if(1==n)
			{
				Sys.delete("org_bmxxb", "txbjqjdmc in "+val_txbjqjdmc, new Object[]{});
				Sys.delete("org_cjxx",  "txbjqjdmc in "+val_txbjqjdmc, new Object[]{});
				Sys.delete("org_gcxxb",  "txbjqjdmc in "+val_txbjqjdmc, new Object[]{});
				Sys.delete("org_jtxxb",  "txbjqjdmc in "+val_txbjqjdmc, new Object[]{});
				Sys.delete("org_zzjgxxb",  "txbjqjdmc in "+val_txbjqjdmc, new Object[]{});
				Object fjdid = new Object();
				for(int j = 0; j < zzjg_inlist.size(); j++) {
					Map<String, Object> mapin = new HashMap<String, Object>();
					if ("org_jtxxb".equals(zzjg_inlist.get(j).get("zzjglx"))) {
						
						mapin.put("jtmc", zzjg_inlist.get(j).get("zzjgmc"));
						mapin.put("jtms", zzjg_inlist.get(j).get("zzjgms"));
						mapin.put("txbjqjdmc", zzjg_inlist.get(j).get("txbjqjdmc"));
						Dataset datasetjtxx= Sys.query("org_jtxxb", "jtid,jtmc,jtms,txbjqjdmc", "txbjqjdmc = ?", null, new Object[]{zzjg_inlist.get(j).get("txbjqjdmc")});
						if(datasetjtxx.getList().size()>0)
						{
							fjdid = datasetjtxx.getList().get(0).get("jtid");
							Sys.update("org_jtxxb", mapin, "jtid = ?", new Object[]{fjdid} );
						}else{
							Sys.insert("org_jtxxb", mapin);
							fjdid = mapin.get("jtid");
						}
						zzjg_inlist.get(j).put("glgxid", fjdid);
					}else if("org_gcxxb".equals(zzjg_inlist.get(j).get("zzjglx")))
					{
						mapin.put("gcmc", zzjg_inlist.get(j).get("zzjgmc"));
						mapin.put("gcms", zzjg_inlist.get(j).get("zzjgms"));
						mapin.put("txbjqjdmc", zzjg_inlist.get(j).get("txbjqjdmc"));
						Dataset datasetjtxx= Sys.query("org_gcxxb", "gcid,gcmc,gcms,txbjqjdmc", "txbjqjdmc = ?", null, new Object[]{zzjg_inlist.get(j).get("txbjqjdmc")});
						if(datasetjtxx.getList().size()>0)
						{
							fjdid = datasetjtxx.getList().get(0).get("gcid");
							Sys.update("org_gcxxb", mapin, "gcid = ?", new Object[]{fjdid} );
						}else{
							Sys.insert("org_gcxxb", mapin);
							fjdid = mapin.get("gcid");
						}
						zzjg_inlist.get(j).put("glgxid", fjdid);
					}else if("org_cjxx".equals(zzjg_inlist.get(j).get("zzjglx")))
					{
						mapin.put("cjmc", zzjg_inlist.get(j).get("zzjgmc"));
						mapin.put("cjms", zzjg_inlist.get(j).get("zzjgms"));
						mapin.put("txbjqjdmc", zzjg_inlist.get(j).get("txbjqjdmc"));
						Dataset datasetjtxx= Sys.query("org_cjxx", "cjid,cjmc,cjms,txbjqjdmc", "txbjqjdmc = ?", null, new Object[]{zzjg_inlist.get(j).get("txbjqjdmc")});
						if(datasetjtxx.getList().size()>0)
						{
							fjdid = datasetjtxx.getList().get(0).get("cjid");
							Sys.update("org_cjxx", mapin, "cjid = ?", new Object[]{fjdid} );
						}else{
							Sys.insert("org_cjxx", mapin);
							fjdid = mapin.get("cjid");
						}
						zzjg_inlist.get(j).put("glgxid", fjdid);
					}else if("org_bmxxb".equals(zzjg_inlist.get(j).get("zzjglx")))
					{
						mapin.put("bmmc", zzjg_inlist.get(j).get("zzjgmc"));
						mapin.put("bmms", zzjg_inlist.get(j).get("zzjgms"));
						mapin.put("txbjqjdmc", zzjg_inlist.get(j).get("txbjqjdmc"));
						Dataset datasetjtxx= Sys.query("org_bmxxb", "bmid,bmmc,bmms,txbjqjdmc", "txbjqjdmc = ?", null, new Object[]{zzjg_inlist.get(j).get("txbjqjdmc")});
						if(datasetjtxx.getList().size()>0)
						{
							fjdid = datasetjtxx.getList().get(0).get("bmid");
							Sys.update("org_bmxxb", mapin, "bmid = ?", new Object[]{fjdid} );
						}else{
							Sys.insert("org_bmxxb", mapin);
							fjdid = mapin.get("bmid");
						}
						zzjg_inlist.get(j).put("glgxid", fjdid);
					}
				}
				int t = 0; 
				while(zzjg_inlist.size()>0)
				{
					Map<String, Object> mapin = new HashMap<String, Object>();
					if(StringUtils.isNotBlank(zzjg_inlist.get(t).get("fjdid").toString())||StringUtils.isBlank(zzjg_inlist.get(t).get("from").toString())) {
						Object zzjgid = new Object();
						Dataset datasetjtxx= Sys.query("org_zzjgxxb", "zzjgid,zzjgmc,zzjgbm,zzjglx,glgxid,fjdid,txbjqjdmc", "txbjqjdmc = ?", null, new Object[]{zzjg_inlist.get(t).get("txbjqjdmc")});
						mapin.put("zzjgmc", zzjg_inlist.get(t).get("zzjgmc"));
						mapin.put("zzjgbm", zzjg_inlist.get(t).get("zzjgbm"));
						mapin.put("zzjglx", zzjg_inlist.get(t).get("zzjglx"));
						mapin.put("glgxid", zzjg_inlist.get(t).get("glgxid"));
						mapin.put("txbjqjdmc", zzjg_inlist.get(t).get("txbjqjdmc"));
						if(StringUtils.isNotBlank(zzjg_inlist.get(t).get("fjdid").toString()))
						{
							mapin.put("fjdid", zzjg_inlist.get(t).get("fjdid"));
						}
						if(datasetjtxx.getList().size()>0)
						{
							zzjgid = datasetjtxx.getList().get(0).get("zzjgid");
							Sys.update("org_zzjgxxb", mapin, "zzjgid = ?", new Object[]{zzjgid} );
						}else{
							Sys.insert("org_zzjgxxb", mapin);
							zzjgid = mapin.get("zzjgid");
						}
						
						String txbjqjdmc = zzjg_inlist.get(t).get("txbjqjdmc").toString();
						zzjg_inlist.remove(t);
						t=0;
						for(int j = 0; j < zzjg_inlist.size(); j++) {
							if(zzjg_inlist.get(j).get("from").equals(txbjqjdmc))
							{
								zzjg_inlist.get(j).put("fjdid", zzjgid);
							}
						}
					}else{
						t++;
					}
				}
				//保存到本地
				ByteArrayInputStream tInputStringStream = new ByteArrayInputStream(parameter.get("e_data").toString().getBytes());
				Sys.saveFile("/zzjg/zzjg", tInputStringStream);

				System.out.println(t);
				bundle.put("msg", "保存成功");
			}else if(n<1){
				bundle.put("msg", "请确保有一个根节点");
			}
		}else{
			bundle.put("msg", "数据为空");
		}
		return "json:msg";
	}
	
	
}
