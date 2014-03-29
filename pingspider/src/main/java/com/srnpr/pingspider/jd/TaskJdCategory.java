package com.srnpr.pingspider.jd;

import com.srnpr.pingspider.spidermodel.MTaskInfo;
import com.srnpr.pingspider.spiderroot.RootPipe;

public class TaskJdCategory extends MTaskInfo {

	public TaskJdCategory() {
		this.setStartUrl("http://www.jd.com/allSort.aspx");

		this.setPipe(new RootPipe());

		this.setThreadNumber(20);
		ProcessJdCategory processJdCategory=new ProcessJdCategory();
	
		this.setProcess(processJdCategory);

	}

}
