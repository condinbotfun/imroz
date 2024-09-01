package Stram_code.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_of_Each_Character 
{
	public  static void findCountOfChars(String s) {
		Map<String, Long> map = Arrays.stream(s.split(""))
		                              .map(String::toLowerCase)
		                              .collect(Collectors
		                              .groupingBy(str->str,
		                                LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		}
	public static void main(String[] args)
	{
		findCountOfChars("string data to count each character");
	}

}