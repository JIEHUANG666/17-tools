/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: week02Demo
 * @Package: week02 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月8日 下午2:55:59 
 * @version: V1.0   
 */
package week02;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月8日 下午2:55:59  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link week02.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		
		String test = "abc";
		
		String name = FileUtil.getExtendName(test);
		
		System.out.println(name);
	}

	/**
	 * Test method for {@link week02.FileUtil#getTempDiretory()}.
	 */
	@Test
	public void testGetTempDiretory() {
		
		System.out.println(FileUtil.getTempDiretory());
		
	}

	/**
	 * Test method for {@link week02.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
