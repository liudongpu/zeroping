package com.srnpr.testping.testcraw;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srnpr.zapcom.basehelper.NetHelper;
import com.srnpr.zapcom.basehelper.TestHelper;

public class TestNet extends TestHelper {

	@Test
	public void test() {
		
		
		boolean bFlagEnable=NetHelper.checkUrlHost("http://www.baidu.com/aa");
		
		bLogTest(bFlagEnable);
	}

}
