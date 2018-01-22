package org.paiza.excercise.javabasic.challenge;

import java.util.Scanner;

public class Bai1Chuoisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] strChar = new char[N];
		
		if(N >= 1 && N <= 100) {
			for(int i = 0; i < N; i++) {
				strChar[i] = '*';
			}
			for(int i = 0; i < N; i++) {
				System.out.print(strChar[i]);
			}
		}
		else {
			System.out.print("Xin loi dieu kien N la : 1 <= N"
					+ "<= 100");
			//branch1
		}

	}

}
