package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(j == i) {
					System.out.printf("*");
					continue;
				}
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}

}
