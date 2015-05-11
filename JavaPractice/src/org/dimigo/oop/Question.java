/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author	: 양권우
 * @version	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("13/14시즌 EPL 우승팀은?");
		answer = scanner.nextLine();
		if("맨체스터 시티".equals(answer)) {
			System.out.println("정답입니다 ^^");
		}
		else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		System.out.println();
		
		System.out.println("13/14시즌 라리가 우승팀은?");
		answer = scanner.nextLine();
		if("아틀레티코 마드리드".equals(answer)) {
			System.out.println("정답입니다 ^^");
		}
		else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		System.out.println();
		
		System.out.println("13/14시즌 세리에A 우승팀은?");
		answer = scanner.nextLine();
		if("유벤투스".equals(answer)) {
			System.out.println("정답입니다 ^^");
		}
		else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
	}

}
