package com.srnpr.testping.craw;

import java.util.List;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class PageProcess implements PageProcessor {

	private Site site = Site
			.me()
			.setDomain("www.jd.com")
			.setUserAgent(
					"Mozilla/5.0 (compatible; Baiduspider/2.0; +http://www.baidu.com/search/spider.html)");

	public Site getSite() {
		// TODO Auto-generated method stub
		return site;
	}

	public void process(Page page) {
		// TODO Auto-generated method stub

		String urlPattern = "http://list.jd.com/*.html";
		urlPattern = "("
				+ urlPattern.replace(".", "\\.").replace("*", "[^\"'#]*") + ")";

		List<String> links = page.getHtml().links().regex(urlPattern).all();

		page.addTargetRequests(links);

	}

}
