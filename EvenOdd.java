package imroz;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no<=0)
		{
			System.out.println("invalid no" + no);
		}
		else if(no%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
