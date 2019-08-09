/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtil.java 
 * @Prject: week02Demo
 * @Package: week02 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月8日 下午4:43:34 
 * @version: V1.0   
 */
package week02;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/** 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月8日 下午4:43:34  
 */
public class StreamUtil {

//	批量关闭流，参数能有无限个
	public static void closeAll(AutoCloseable ... autoCloseable) {
		
		if(null!= autoCloseable)
			for (AutoCloseable autoCloseable2 : autoCloseable) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
//	传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，并使用第一个的关闭流的方法
	public static String readTextFile(InputStream src) throws IOException {
		
		byte[] b = new byte[1024];
		int len = 0;
		String str = "";
		while((len=src.read(b))!=-1) {
			
			str+=new String(b,"UTF-8");
		}
//		调用上面的方法关闭流
		closeAll(src);
		
		return str;
		
	}
//	传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，并使用第一个的关闭流的方法
	public static String readTextFiler(InputStreamReader src) throws IOException {
		
		char[] b = new char[1024];
		int len = 0;
		String str = "";
		while((len=src.read(b))!=-1) {
			
			str+=new String(b);
		}
//		调用上面的方法关闭流
		closeAll(src);
		
		return str;
		
	}
	
	
	
}
