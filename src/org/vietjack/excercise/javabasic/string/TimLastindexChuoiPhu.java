package org.vietjack.excercise.javabasic.string;

public class TimLastindexChuoiPhu {
	public static void main(String[] args) {
		String strOrg = "Hello word, Hello me";
		int lastIndex = strOrg.lastIndexOf("Hello");
		
//		System.out.println(lastIndex);
		
		if(lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last index of 'Hello' word is :" + lastIndex);
		}
	}

}
