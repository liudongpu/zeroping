package com.srnpr.pingspider.jd;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import com.srnpr.pingspider.spidercache.SpiderPageCache;
import com.srnpr.pingspider.spiderroot.RootHtml;
import com.srnpr.pingspider.spiderroot.RootSpiderProcess;
import com.srnpr.zapcom.baseclass.BaseLog;
import com.srnpr.zapcom.basehelper.FormatHelper;
import com.srnpr.zapcom.basehelper.RegexHelper;
import com.srnpr.zapcom.basemodel.MDataMap;
import com.srnpr.zapdata.dbdo.DbUp;

public class ProcessJdCategory extends RootSpiderProcess {

	public void pageProcess(Page page) {

		String sUrl = page.getRequest().getUrl();

		if (!SpiderPageCache.INSTANCE.containsKey(sUrl)) {
			MDataMap mDataMap = new MDataMap();
			mDataMap.put("page_url", page.getRequest().getUrl());
			mDataMap.put("last_spider_time", FormatHelper.upDateTime());
			mDataMap.put("create_time", FormatHelper.upDateTime());
			mDataMap.put("update_time", FormatHelper.upDateTime());
			mDataMap.put("page_content", page.getHtml().toString());

			DbUp.upTable("pp_webpage").dataInsert(mDataMap);
			SpiderPageCache.INSTANCE.inElement(mDataMap.get("page_url"),
					mDataMap);
		}

		String urlPattern = "http://list.jd.com/*.html";
		urlPattern = "("
				+ urlPattern.replace(".", "\\.").replace("*", "[^\"'#]*") + ")";

		List<String> links = page.getHtml().links().regex(urlPattern).all();

		page.addTargetRequests(links);

		// saveCategoryLink(page);

	}

	/**
	 * 解析并保存分类信息
	 * 
	 * @param page
	 */
	public void saveCategoryLink(Page page) {

		RootHtml pageHtml = new RootHtml(page.getHtml().toString());

		RootHtml allSort = pageHtml.upCssOne("#allsort");

		for (RootHtml htmlOne : allSort.upCssAll("div .m")) {

			RootHtml oneTitle = htmlOne.upCssOne(".mt h2");

			String sTilteOne = oneTitle.upText();

			for (RootHtml htmlTwo : htmlOne.upCssAll("dl")) {

				RootHtml twoTitle = htmlTwo.upCssOne("dt");

				String sTitleTwo = twoTitle.upText();

				for (RootHtml htmlThree : htmlTwo.upCssAll("dd em")) {

					String sTitle3 = htmlThree.upText();

					BaseLog.LogInfo(this.getClass().getName(), 0, sTilteOne
							+ "-" + sTitleTwo + "-" + sTitle3);
				}

			}

			// BaseLog.LogInfo(this.getClass().getName(), 0, sTilteOne);
		}

	}

}
