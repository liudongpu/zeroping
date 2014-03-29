package com.srnpr.pingspider.spiderface;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.processor.PageProcessor;

public interface ISpoderProcess extends PageProcessor {

	public void pageProcess(Page page);

}
