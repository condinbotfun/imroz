package Stram_code;

import java.util.Arrays;
import java.util.List;

public class Find_Number_Starting_with_1 
{
	public static void main(String[] args)
	{
		List<Integer> lst = Arrays.asList(1,2,3,12,13,16,110);
		lst.stream().map(s -> s+" ").filter(s-> s.startsWith("1")).forEach(System.out::println);
		
	}

}
