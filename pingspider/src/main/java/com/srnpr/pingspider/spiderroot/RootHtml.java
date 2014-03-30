package com.srnpr.pingspider.spiderroot;

import java.util.ArrayList;
import java.util.List;

import com.srnpr.zapcom.basehelper.RegexHelper;

import us.codecraft.webmagic.selector.Html;

public class RootHtml extends Html {

	public RootHtml(String text) {
		super(text);
	}

	public RootHtml upCssOne(String selector) {
		return upCssAll(selector).get(0);
	}

	public List<RootHtml> upCssAll(String selector) {
		return upAllList(this.css(selector).all());
	}

	public List<RootHtml> upAllList(List<String> inputSource) {
		List<RootHtml> listRootHtmls = new ArrayList<RootHtml>();

		for (String sHtml : inputSource) {
			listRootHtmls.add(new RootHtml(sHtml));
		}

		return listRootHtmls;
	}
	
	
	public String upText()
	{
		return  RegexHelper.upHtmlText(this.toString());
	}
	
	

}
