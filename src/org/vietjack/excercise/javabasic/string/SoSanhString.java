package org.vietjack.excercise.javabasic.string;

public class SoSanhString {
	public static void main(String[] args) {
		String s1 = "Vietjack";
		String s2 = "Vietjack";
		String s3 = new String("Vietjack");
		String s4 = "VietjackTeam";
		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1 == s4);
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
		
		String str1 = "Chuoi nay dai nhat";
		String str2 = "chuoi nay dai nhi";
		String str3 = "chuoi dai ba";
		String str4 = "Chuoi nay dai asdf";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str4));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str2));
		
	}

}
