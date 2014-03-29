package com.srnpr.pingspider.spiderroot;

import com.srnpr.pingspider.spiderface.ISpiderTaskInfo;
import com.srnpr.pingspider.spiderface.ISpoderProcess;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public abstract class RootSpiderProcess implements ISpoderProcess {

	private Site site = Site
			.me()
			.setUserAgent(
					"Mozilla/5.0 (compatible; Baiduspider/2.0; +http://www.baidu.com/search/spider.html)");

	public Site getSite() {

		return site;
	}

	

	public void process(Page page) {

		pageProcess(page);
	}

}
