package com.srnpr.pingspider.spiderroot;

import com.srnpr.pingspider.spiderface.ISpiderPipe;
import com.srnpr.zapcom.baseclass.BaseClass;
import com.srnpr.zapdata.dbdo.DbUp;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * 基本结果处理类
 * 
 * @author srnpr
 * 
 */
public class RootPipe extends BaseClass implements ISpiderPipe {

	public void process(ResultItems resultItems, Task task) {


		String sUrlString = resultItems.getRequest().getUrl();

		// DbUp.upTable("pp_webpage").count("page_url",sUrlString);

	
		
		bLogInfo(0,sUrlString);

	}

}
