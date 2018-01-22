package org.vietjack.excercise.javabasic.string;

public class ChiaChuoiPhu {
	public static void main(String[] args) {
		String str = "jan-feb-march";
		String[] temp;
		String delimeter = "-";
		temp = str.split(delimeter);
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);	
		}
		
		String str1 = "jan.feb.march.Apr.Jun.Jul";
		String[] temp1;
		String Delimeter1 = "\\.";
		temp1 = str1.split(Delimeter1,3);
		for(int i = 0; i < temp1.length; i++) {
			System.out.println(temp1[i]);
		}
		
		
	}

}
