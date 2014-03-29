package com.srnpr.pingspider.spiderface;

public interface ISpiderTaskInfo {

	
	public String getStartUrl();
	
	
	public int getThreadNumber();
	
	public ISpiderPipe getPipe();
	
	public ISpoderProcess getProcess();
	
	
}
