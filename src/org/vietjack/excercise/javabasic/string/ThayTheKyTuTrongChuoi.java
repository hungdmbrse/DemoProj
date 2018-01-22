package org.vietjack.excercise.javabasic.string;

public class ThayTheKyTuTrongChuoi {
	
	public static String replaceString(String str,String replFrom, String replTo) {
		String strTemp = str;
		strTemp = str.replace(replFrom, replTo);
		return strTemp;
	}
	
	public static void main(String[] args) {
		String str = "Hoc sinh ma lai di hoc mon sinh hoc";
		
		String str1 = replaceString(str, "hoc", "deohoc");
		System.out.println(str1);
	}

}
