package imroz;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Start");
		int b = sc.nextInt();
		System.out.println("end");
		for(int i=a;i<=b;i++)
		{
			int count =0;
			if(i>1)
			{
				for(int j =2;j<i;j++)
				{
					if(i%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println(i);
				}
			}
		}
	}

}
