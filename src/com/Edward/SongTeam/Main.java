package com.Edward.SongTeam;

import java.util.Scanner;

public class Main {
	static int minMember(int[] height){
		int max=0;
		int length=height.length;
		int[] leftLen=new int[length];		//左侧递增串长度
		int[] rightLen=new int[length];		//右侧递减串长度
		for(int i=0;i<length;i++){
			leftLen[i]=1;
			//左侧递增串长度
			for(int j=0;j<i;j++)
				if(height[j]<height[i])
					leftLen[i]=Math.max(leftLen[i], leftLen[j]+1);		//当前i左侧底层串长度最大值与j左侧递增串长度最大值加1中取其大
		}
		//右侧递减串长度
		for(int i=length-1;i>=0;i--){
			rightLen[i]=1;
			for(int j=length-1;j>i;j--)
				if(height[j]<height[i])
					rightLen[i]=Math.max(rightLen[i],rightLen[j]+1);
			max=Math.max(max, leftLen[i]+rightLen[i]-1);
			//System.out.println("max["+i+"]:"+max);
		}
		return height.length-max;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] height=new int[n];
		for(int i=0;i<n;i++){
			height[i]=scan.nextInt();
		}
		System.out.println(minMember(height));
	}
}
