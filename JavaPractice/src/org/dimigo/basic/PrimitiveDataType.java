package org.dimigo.basic;

/*
 *  << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015. 03. 13
 * @author 양권우
 * @version 1.0
 * 
 */

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		String Name = "아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char BloodType = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.printf("이름 : %s\n", Name);
		System.out.printf("성별 : ");
		if(gender) {
			System.out.printf("여자\n");
		}
		else {
			System.out.printf("남자\n");
		}
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.printf("혈액형 : %c형\n", BloodType);
	}

}
