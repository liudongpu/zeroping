package com.srnpr.testping.testcraw;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srnpr.testping.craw.PageProcess;
import com.srnpr.testping.craw.SpPipeLine;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;

public class testspider {

	@Test
	public void test() {
		
		
		
		
		//Spider.create(new SimplePageProcessor("http://www.jd.com/","http://list.jd.com/*.html")).thread(5).run();
		
		
		  Pipeline pipeline=new SpPipeLine();
		Spider.create(new PageProcess()).addUrl("http://www.jd.com").addPipeline(pipeline)
          .thread(5).run();

		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
