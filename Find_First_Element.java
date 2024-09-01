package Stram_code;

import java.util.Arrays;
import java.util.List;

public class Find_First_Element
{
	public static void main(String[] args)
	{
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
		lst.stream().findFirst().ifPresent(System.out::println);
		
	}

}
