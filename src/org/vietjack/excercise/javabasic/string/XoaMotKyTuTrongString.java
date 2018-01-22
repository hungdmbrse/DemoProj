package org.vietjack.excercise.javabasic.string;

public class XoaMotKyTuTrongString {
	
	public static String removeChar(String str, char n) {
		int nIndex;
		do {
			nIndex = str.indexOf(n);
			if(nIndex != -1) {
				str = str.substring(0, nIndex) + str.substring(nIndex+1);
			}
		}while(nIndex != -1);
		
		return str;
	}
	
	public static void main(String[] args) {
		String strOrg = "Dat la thang con nit ranh tre trau";
		String str = XoaMotKyTuTrongString.removeChar(strOrg, 'n');
		System.out.println("Chuoi :" + str);
		System.out.println(strOrg);
	}

}
