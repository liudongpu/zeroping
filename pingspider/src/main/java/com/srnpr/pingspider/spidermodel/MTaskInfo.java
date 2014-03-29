package com.srnpr.pingspider.spidermodel;

import com.srnpr.pingspider.spiderface.ISpiderPipe;
import com.srnpr.pingspider.spiderface.ISpiderTaskInfo;
import com.srnpr.pingspider.spiderface.ISpoderProcess;

public class MTaskInfo implements ISpiderTaskInfo {

	/**
	 * 任务起始url
	 */
	private String startUrl = "";

	/**
	 * 线程数量
	 */
	private int threadNumber = 1;

	private ISpiderPipe pipe;
	
	private ISpoderProcess process;

	public String getStartUrl() {
		return startUrl;
	}

	public void setStartUrl(String startUrl) {
		this.startUrl = startUrl;
	}

	public ISpiderPipe getPipe() {
		return pipe;
	}

	public void setPipe(ISpiderPipe pipe) {
		this.pipe = pipe;
	}

	public int getThreadNumber() {
		return threadNumber;
	}

	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public ISpoderProcess getProcess() {
		return process;
	}

	public void setProcess(ISpoderProcess process) {
		this.process = process;
	}

}
