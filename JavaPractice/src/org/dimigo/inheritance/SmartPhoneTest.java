/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] smart = {
			new IPhone("iPhone 6", "애플", 700000),
			new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone s : smart) {
			System.out.println(s.toString());
			s.turnOn();
			s.pay();
			s.useSpecialFuction(s);
			s.turnOff();
			System.out.println();
			
		}
		
	}

}
