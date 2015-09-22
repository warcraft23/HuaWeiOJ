package com.Edward.EncryptDecryptString;

import java.util.Scanner;

public class Main {
	static void Encrypt(char[] aucPassword,char[] aucResult){
		if(aucPassword.length!=aucResult.length||aucPassword.length==0||aucResult.length==0||aucPassword.length>100||aucResult.length>100)
			return;
		int length=aucPassword.length;
		for(int i=0;i<length;i++){
			if(aucPassword[i]>='A'&&aucPassword[i]<='Z'){
				aucResult[i]=(char) ((aucPassword[i]-'A'+1)%26+'A'+32);
			}else if(aucPassword[i]>='a'&&aucPassword[i]<='z'){
				aucResult[i]=(char) ((aucPassword[i]-'a'+1)%26+'a'-32);
			}else if(aucPassword[i]>='0'&&aucPassword[i]<='9'){
				aucResult[i]=(char) ((aucPassword[i]-'0'+1)%10+'0');
			}else{
				aucResult[i]=aucPassword[i];
			}
		}	
	}
	static int unEncrypt(char[] result,char[] password){
		if(result.length!=password.length||result.length==0||password.length==0||result.length>100||password.length>100)
			return -1;
		int length=result.length;
		for(int i=0;i<length;i++){
			if(result[i]>='A'&&result[i]<='Z'){
				password[i]=(char) ((result[i]-'A'-1)%26+'A'+32);
			}else if(result[i]>='a'&&result[i]<='z'){
				password[i]=(char) ((result[i]-'a'-1)%26+'a'-32);
			}else if(result[i]>='0'&&result[i]<='9'){
				password[i]=(char) ((result[i]-'0'-1)%10+'0');
			}else{
				password[i]=result[i];
			}
		}	
		return 0;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		String str = scan.nextLine();
		char[] aucPassword=new char[str.length()];
		char[] aucResult=new char[str.length()];
		aucPassword=str.toCharArray();
		
		str=scan.nextLine();
		char[] result=new char[str.length()];
		char[] password=new char[str.length()];
		result=str.toCharArray();
		
		Encrypt(aucPassword, aucResult);
		System.out.println(aucResult);
		unEncrypt(result, password);
		System.out.println(password);
		
	}
}
