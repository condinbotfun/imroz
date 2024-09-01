package imroz;

import java.util.Scanner;

public class Armstron_Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int digit,n=sc.nextInt();
		int temp=n,sum=0;
		while(n!=0)
		{
			digit=n%10;
			sum+=digit*digit*digit;
			n=n/10;
		}
		System.out.println(temp==sum);
		sc.close();
		
	}

}
