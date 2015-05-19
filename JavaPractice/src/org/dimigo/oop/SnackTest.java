/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ SnackTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] S = {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)};
		
		int totalprice = 0;
		
		for(Snack value : S) {
			value.printSnack();
			totalprice += value.calcPrice();
		}
		
		System.out.println("총 구매 금액  : " + String.format("%,d", totalprice));
		
	}

}
