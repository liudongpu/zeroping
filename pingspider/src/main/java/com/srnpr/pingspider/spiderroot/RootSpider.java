package com.srnpr.pingspider.spiderroot;

import us.codecraft.webmagic.Spider;

import com.srnpr.pingspider.spiderface.ISpiderTaskInfo;

public class RootSpider {

	public void start(ISpiderTaskInfo iTaskInfo) {

		Spider.create(iTaskInfo.getProcess()).addUrl(iTaskInfo.getStartUrl())
				.addPipeline(iTaskInfo.getPipe())
				.thread(iTaskInfo.getThreadNumber()).run();

	}

}
