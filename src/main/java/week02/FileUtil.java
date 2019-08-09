/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtil.java 
 * @Prject: week02Demo
 * @Package: week02 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月8日 下午2:48:27 
 * @version: V1.0   
 */
package week02;

import java.io.File;

/** 
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月8日 下午2:48:27  
 */
public class FileUtil {

	/**
	 * 给一个名，获得这个名的后缀
	 * @Title: getExtendName 
	 * @Description: TODO
	 * @param fieName
	 * @return
	 * @return: String
	 */
	public static String getExtendName(String fileName) {
		
		if(null!=fileName && fileName.length()>0 && fileName.indexOf(".")>-1) {
			
			return 	fileName.substring(fileName.lastIndexOf("."));
		}
		return "文件命名不合法";
		
	}
	
	/**
	 * 返回操作系统的临时目录
	 * @Title: getTempDiretory 
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File getTempDiretory() {
		
		return new File(System.getProperty("java.io.tmpdir"));
		
	}
	
	/**
	 * 返回操作系统用户目录
	 * @Title: getUserDirectory 
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File getUserDirectory() {
		
		
		return new File(System.getProperty("user.home"));
		
	}
	
}
