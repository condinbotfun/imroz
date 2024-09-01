package Stram_code;

import java.util.Arrays;
import java.util.List;

public class Total_Number
{
	public static void main(String[] args)
	{
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Long count =lst.stream().count();
		System.out.println(count);
		
	}

}
