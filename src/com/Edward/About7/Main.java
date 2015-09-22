package com.Edward.About7;

import java.util.Scanner;

public class Main {
	static int about7(int num){
		int res=0;
		for(int i=1;i<=num;i++){
			if(i%7==0)
				res++;
			else {
				if (String.valueOf(i).indexOf('7')>=0)
					res++;
			}
		}
		return res;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		System.out.println(about7(num));
	}
}
