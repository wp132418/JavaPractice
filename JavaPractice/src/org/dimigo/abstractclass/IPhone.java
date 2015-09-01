/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ IPhone
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class IPhone extends SmartPhone{
	public IPhone() {
	}
	
	public IPhone(String model, String company, int price) {
		super(model,company,price);
	}
	
	public void pay() {
		System.out.print("애플");
		super.pay();
	}
	
	public void useAirDrop() {
		System.out.print("AirDrop ");
	}
	
}
