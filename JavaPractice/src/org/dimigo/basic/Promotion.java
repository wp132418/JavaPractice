package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Monthsalary = 1700000;
		int worker = 3;
		int shop = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d\n", Monthsalary);
		System.out.printf("점포 내 직원수 : %,d\n", worker);
		System.out.printf("점포 수 : %,d\n\n", shop);
		
		long Yearsalary = (long)Monthsalary * worker * shop * 12;
		System.out.printf("연간 인건비 : %,d\n", Yearsalary);
		
	}

}
