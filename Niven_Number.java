package imroz;

import java.util.Scanner;

public class Niven_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(n%sum(n)==0?"Niven number ":"Not Niven");
	}
	private static int sum(int n)
	{
		int digit,sum=0;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
	}
}
