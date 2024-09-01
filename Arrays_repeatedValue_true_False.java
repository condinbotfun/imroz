package Stram_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Arrays_repeatedValue_true_False
{
	public  boolean containsDuplicate(int [] n)
	{
		List<Integer> lst =Arrays.stream(n).boxed().collect(Collectors.toList());
		Set<Integer> set= new HashSet<Integer>(lst);
		if(set.size()==lst.size())
		{
			return false;
		}
		return true;
	}


}
