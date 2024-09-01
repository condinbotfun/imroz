package imroz;

import java.util.Scanner;

public class Sum_of_Digit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit,number=sc.nextInt();
		int sum =0;
		while(number!=0)
		{
			digit=number%10;
			sum = sum+digit;
			number=number/10;
			System.out.println(sum);
		}
	}

}
