package com.srnpr.pingspider.spidercache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import com.srnpr.zapcom.baseface.IBaseInstance;
import com.srnpr.zapcom.basemodel.MDataMap;
import com.srnpr.zapcom.rootclass.CacheDefine;
import com.srnpr.zapdata.dbdo.DbUp;

public class SpiderPageCache implements IBaseInstance {

	
	
	public static SpiderPageCache INSTANCE =new SpiderPageCache();
	
	
	private Cache cache;

	public SpiderPageCache() {
		CacheDefine cDefine = new CacheDefine();
		String sClassNameString = this.getClass().getName();
		cache = cDefine.inCache(sClassNameString);

		for (MDataMap mDataMap : DbUp.upTable("pp_webpage").queryAll(
				"page_url,last_spider_time", "", "", null)) {
			inElement(mDataMap.get("page_url"), mDataMap);
		}

	}

	/**
	 * 添加缓存
	 * 
	 * @param k
	 * @param v
	 */
	public void inElement(String k, MDataMap v) {

		cache.put(new Element(k, v));
	}

	/**
	 * 判断是否存在
	 * 
	 * @param k
	 * @return
	 */
	public boolean containsKey(String k) {
		// return cache.getKeys().contains(k);
		return cache.isKeyInCache(k);
	}

}
