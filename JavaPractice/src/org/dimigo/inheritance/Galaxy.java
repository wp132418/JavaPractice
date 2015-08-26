/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Galaxy
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class Galaxy extends SmartPhone{
	public Galaxy() {
	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.print("삼성");
		super.pay();
	}
	
	public void useWirelessCharging() {
		System.out.print("무선 충전 ");
	}
}
