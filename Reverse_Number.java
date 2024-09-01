package imroz;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit,number = sc.nextInt();
		int result =0;
		while(number!=0)
		{
			digit=number%10;
			result = result*10+digit;
			number=number/10;
		}
		System.out.println(result);
		
		
	}

}
