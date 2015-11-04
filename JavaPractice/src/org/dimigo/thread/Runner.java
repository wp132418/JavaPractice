/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *  |_ Runner
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class Runner extends Thread{
	private String name;
	
	public Runner() {
	}
	
	public Runner(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		int i;
		System.out.println(name + " 출발");
		
		try {
			for(i=100; i>=0; i -= 10) {
				System.out.println(name +" " + i + " 미터");
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name + " 골인");
	}
}
