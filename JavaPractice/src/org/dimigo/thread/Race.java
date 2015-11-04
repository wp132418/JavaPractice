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
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 = new Runner("파오후");
		Thread t2 = new Runner("쿰척쿰척");
		
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");

	}

}
