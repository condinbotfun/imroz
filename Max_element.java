package Stram_code;

import java.util.Arrays;
import java.util.List;

public class Max_element
{
	public static void main(String[] args)
	{
		List<Integer> lst = Arrays.asList(1,2,3,4,5,44,55,222,100);
		int max= lst.stream().max(Integer::compare).get();
		System.out.println(max);
		
	}

}
