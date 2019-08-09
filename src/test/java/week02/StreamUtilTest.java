/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: week02Demo
 * @Package: week02 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月8日 下午8:45:06 
 * @version: V1.0   
 */
package week02;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月8日 下午8:45:06  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link week02.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testCloseAll() throws FileNotFoundException, IOException {
		
//		String file = StreamUtil.readTextFile(new FileInputStream("E:o\\l.txt"));
//		System.out.println(file);
		
		String file = StreamUtil.readTextFiler(new FileReader("E:o\\l.txt"));
		System.out.println(file);
		
	}

	/**
	 * Test method for {@link week02.StreamUtil#readTextFile(java.io.InputStream)}.
	 */
	@Test
	public void testReadTextFile() {
		fail("Not yet implemented");
	}

}
