package imroz;

import java.util.Scanner;

public class Duck_No 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit,number= sc.nextInt();
		boolean isDuckNo=false;
		while(number!=0)
		{
			digit=number%10;
			{
				if(digit==0)
				{
					isDuckNo=true;
					break;
				}
				number=number/10;
			}
			if(isDuckNo)
			{
				System.out.println("Number is duck no");
			}
			else
			{
				System.out.println("Not a duck no");
			}
		}
	}

}
