package com.srnpr.testping.craw;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class SpPipeLine implements Pipeline {

	public void process(ResultItems resultItems, Task task) {
		
		
		System.out.println("get page: " + resultItems.getRequest().getUrl());
		
		
	}

}
