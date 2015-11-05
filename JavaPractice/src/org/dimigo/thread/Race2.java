/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *  |_ Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner2("메시"));
		Thread t2 = new Thread(new Runner2("호날두"));
		
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");

	}

}
