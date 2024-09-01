package Stram_code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_All_Value_Decending
{
	public static void main(String[] args)
	{
		List<Integer> lst = Arrays.asList(1,22,33,44,2,98,100,250,60);
		lst.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
