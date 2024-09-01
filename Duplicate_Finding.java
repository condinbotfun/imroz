package Stram_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Finding 
{
	public static void main(String[] args)
	{
		List<Integer> lst = Arrays.asList(1,2,1,4,5,4,6,7,4,5,6,8);
		Set<Integer> set = new HashSet<Integer>();
		lst.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
	}

}
