package com.Edward.BeautyValue;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
	static int beautyValue(String str){
		int value=0;
		int[] times=new int[26];
		int multi=26;
		str=str.toLowerCase();
		for(int i=0;i<26;i++){
			times[i]=0;
		}
		for(int i=0;i<str.length();i++){
			times[str.charAt(i)-'a']++;
		}
		Arrays.sort(times);
		for(int i=times.length-1;i>=0;i--){
			value+=times[i]*(multi--);
		}
		return value;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=0;
		n=Integer.parseInt(scan.nextLine());
		String[] strs=new String[n];
		for(int i=0;i<n;i++){
			strs[i]=scan.nextLine();
		}
		for(int i=0; i<n;i++){
			System.out.println(beautyValue(strs[i]));
		}
		
	}
}
