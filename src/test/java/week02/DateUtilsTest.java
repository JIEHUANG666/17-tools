/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilsTest.java 
 * @Prject: week02Demo
 * @Package: week02 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月8日 下午2:18:12 
 * @version: V1.0   
 */
package week02;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilsTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月8日 下午2:18:12  
 */
public class DateUtilsTest {

	/**
	 * 
	 * 得到月初的日期
	 * Test method for {@link week02.DateUtils#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
		
		Date date = DateUtils.getDateByInitMonth(new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df.format(date));
	}

	/**
	 * 
	 * 得到月末的日期
	 * Test method for {@link week02.DateUtils#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		
		
		Date date = DateUtils.getDateByFullMonth(new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df.format(date));
		
		
	}
	/**
	 * 
	 * 得到月末的日期（二月）
	 * Test method for {@link week02.DateUtils#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth2() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2019, 1, 1);
		
		Date date = DateUtils.getDateByFullMonth(c.getTime());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df.format(date));
		
		
	}

	/**
	 * {1}   {2}  替换为当前时间 （字符串替换）
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test1() {
		String sql = "select* from t_order where create_time >= '{1}' and create_time <='{1}'";
		Date date = DateUtils.getDateByInitMonth(new Date());
		Date date2 = DateUtils.getDateByFullMonth(new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String sql2 = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));
		
		System.out.println(sql2);
	}
}
