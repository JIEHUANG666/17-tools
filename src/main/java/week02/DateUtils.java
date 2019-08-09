/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtils.java 
 * @Prject: mouseDemo
 * @Package: mouseDemo 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月8日 上午9:30:29 
 * @version: V1.0   
 */
package week02;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtils 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月8日 上午9:30:29  
 */
public class DateUtils {

	/**
	 * 
	 * @Title: getDateByInitMonth 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByInitMonth(Date src) {
//		Calendar获取默认系统时间(当前年，月，日)的日期类       getInstance 实例
		  Calendar c = Calendar.getInstance();
		  
//		  把系统时间替换为当前时间
		  c.setTime(src);
//		  设置这个月的第几天，时间
		  c.set(Calendar.DAY_OF_MONTH, 1);
//		  设置日历类天的第0个小时
		  c.set(Calendar.HOUR_OF_DAY, 0);
		  c.set(Calendar.MINUTE, 0);
		  c.set(Calendar.SECOND, 0);
		  
		return c.getTime();
		
	}
	/**
	 * 得到月末
	 * @Title: getDateByFullMonth 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByFullMonth(Date src) {
		
		Date date = getDateByInitMonth(src);
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		c.add(Calendar.MONTH, 1);
		
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	}
}
