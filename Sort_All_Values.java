package Stram_code;

import java.util.Arrays;
import java.util.List;

public class Sort_All_Values 
{
	public static void main(String[] args) 
	{
		List<Integer> lst = Arrays.asList(1,22,33,44,2,3,5,9,100);
		lst.stream().sorted().forEach(System.out::println);
		
	}

}
