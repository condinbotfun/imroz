package imroz;

import java.util.Scanner;

public class Digit_In_Number 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit, number= sc.nextInt();
		while(number!=0)
		{
			digit=number%10;
			System.out.println(digit);
			digit=number/10;
		}
	}

}
