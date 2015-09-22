package com.Edward.PicArrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static String picArragement(String str){
		String res="";
		int length=str.length();
		if(length==0||length>1024)
			return res;
		char[] chars=new char[length];
		chars=str.toCharArray();
		int lengthChar=chars.length;
		for(int i=0;i<lengthChar;i++){
			if(!((chars[i]>='0'&&chars[i]<='9')||(chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z'))){
				for(int j=i+1;j<lengthChar;j++){
					chars[j-1]=chars[j];
					lengthChar--;
				}
			}
		}
		Arrays.sort(chars,0,lengthChar);
		for(int i=0;i<lengthChar;i++){
			res+=chars[i];
		}
		return res;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String res=picArragement(str);
		System.out.println(res);
	}
}
