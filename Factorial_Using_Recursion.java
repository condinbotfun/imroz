package imroz;
public class Factorial_Using_Recursion
{
	public static int factorial(int number)
	{
		if(number==1 || number==0)
		{
			return 1;
		}
		else
		{
			return number *factorial(number-1);
		}
	}
	public static void main(String[] args)
	{
		int input=factorial(5);
		System.out.println("factorial is  "+input);
	}

}
