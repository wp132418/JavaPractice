package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sadalyA = 9, sadalyB = 10;
		int squareA = 9;
		double sadalyH = 5.8, squareH = 5.4;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", (sadalyA+sadalyB)*sadalyH/2);
		System.out.printf("평행사변형 넓이 : %.1f\n", (squareA)*squareH);
		
		if(((sadalyA+sadalyB)*sadalyH/2)>((squareA)*squareH)) {
			System.out.printf("\n사다리꼴이 평행사변형보다 %.1f큽니다.\n", ((sadalyA+sadalyB)*sadalyH/2)-((squareA)*squareH));
		}
		else if(((sadalyA+sadalyB)*sadalyH/2)<((squareA)*squareH)) {
			System.out.printf("\n평행사변형이 사다리꼴보다 %.1f큽니다.\n", ((squareA)*squareH)-((sadalyA+sadalyB)*sadalyH/2));
		}
		else {
			System.out.println("평행사변형과 사다리꼴의 크기가 같습니다");
		}
	}

}
