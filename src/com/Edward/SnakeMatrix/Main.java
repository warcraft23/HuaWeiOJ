package com.Edward.SnakeMatrix;

import java.util.Scanner;

public class Main {
	static void GetResult(int Num){
		int length=(Num+1)*Num/2;
		int cnt=0;
		char[] pResult=new char[length];
		for(int i=0;i<length;i++){
			pResult[i]='0';
		}
		int row=1;
		int sum=0;
		for(int i=0;i<Num;i++){
			row+=i;
			int step=2+i;
			for(int j=0;j<Num-i;j++){
				if(j==0){
					sum=row;
					System.out.print(sum);
				}else{
					sum+=step++;
					System.out.print(sum);
				}
				if(j!=Num-i-1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		char[] pResult=new char[5050];
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		GetResult(Num);
	}
}
