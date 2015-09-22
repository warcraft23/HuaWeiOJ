package com.Edward.LastStringLength;

import java.util.Scanner;

public class Solution {
	static int lastStringLength(String str){
		
		int res=0;
		int lastIndex=0;
		if(str.length()>=128)
			return -1;
		lastIndex=str.lastIndexOf(' ');
		res=str.length()-1-lastIndex;
		return res;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(lastStringLength(str));
	}
}
