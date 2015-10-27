/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *  |_ SaveImageFromUrl
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 27.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://img.naver.net/static/www/u/2013/0731/nmms_224940510.gif";
		try {
			int result;
			
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			byte[] buf = new byte[10000];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf,0,result);
			}
			System.out.println("파일 생성 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
