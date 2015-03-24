package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "고속버스";
		int length = 25, money = 0;
		
		switch(car) {
		case "고속버스" :
			money += 850;
			break;
		case "경차" :
			money += 300;
			break;
		default :
			money += 600;
		}
		
		switch(car) {
		case "고속버스" :
			money += 300 * ((length-1)/10);
			break;
		default :
			money += 200 * ((length-1)/10);
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + length + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + money + "원");
	}

}
