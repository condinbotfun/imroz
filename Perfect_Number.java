package imroz;

import java.util.Scanner;

public class Perfect_Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPerfect(n));
	}

	 static boolean isPerfect(int n) 
	 {
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;

			}
		}
		return sum==n;
	}
	 

}
