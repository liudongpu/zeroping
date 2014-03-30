package com.srnpr.pingspider.spiderroot;

import com.srnpr.pingspider.spidercache.SpiderPageCache;
import com.srnpr.pingspider.spiderface.ISpiderTaskInfo;
import com.srnpr.pingspider.spiderface.ISpoderProcess;
import com.srnpr.zapcom.baseclass.BaseClass;
import com.srnpr.zapcom.basehelper.FormatHelper;
import com.srnpr.zapcom.basemodel.MDataMap;
import com.srnpr.zapdata.dbdo.DbUp;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author srnpr
 * 
 */
public abstract class RootSpiderProcess extends BaseClass implements
		ISpoderProcess {

	/**
	 * Mozilla/5.0 (compatible; Baiduspider/2.0;
	 * +http://www.baidu.com/search/spider.html)
	 */
	private Site site = Site
			.me()
			.setUserAgent(
					"Mozilla/5.0 (compatible; Testspider/2.0; +http://www.srnpr.com/search/spider.html)");

	public Site getSite() {

		return site;
	}

	public void process(Page page) {

		
		pageProcess(page);

	}
}
