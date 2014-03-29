package com.srnpr.testping.testspider;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srnpr.pingspider.jd.TaskJdCategory;
import com.srnpr.pingspider.spiderroot.RootSpider;

public class TestJd {

	@Test
	public void test() {
		RootSpider rootSpider = new RootSpider();

		rootSpider.start(new TaskJdCategory());
	}

}
