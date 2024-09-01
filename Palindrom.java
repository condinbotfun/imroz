package imroz;

import java.util.Scanner;

public class Palindrom
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int digit,number= sc.nextInt();
		int result =0;
		int temp=number;
		while(number!=0)
		{
			digit=number%10;
			result=result*10+digit;
			number= number/10;
		}
		if(result==temp)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
	}

}
