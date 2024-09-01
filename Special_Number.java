package imroz;

import java.util.Scanner;

public class Special_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit1,digit2,n=sc.nextInt();
		int result =0;
		digit1 =n%10;
		digit2=n/10;
		result=(digit1+digit2)+(digit1*digit2);
		System.out.println(result==n?"Special Number":"not special number");
	}

}
