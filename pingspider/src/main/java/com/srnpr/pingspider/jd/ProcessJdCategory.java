package com.srnpr.pingspider.jd;

import java.util.List;

import us.codecraft.webmagic.Page;

import com.srnpr.pingspider.spiderroot.RootSpiderProcess;

public class ProcessJdCategory extends RootSpiderProcess {

	public void pageProcess(Page page) {

		String urlPattern = "http://list.jd.com/*.html";
		urlPattern = "("
				+ urlPattern.replace(".", "\\.").replace("*", "[^\"'#]*") + ")";

		List<String> links = page.getHtml().links().regex(urlPattern).all();

		page.addTargetRequests(links);

	}

}
