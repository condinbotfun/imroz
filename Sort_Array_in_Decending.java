package imroz;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Array_in_Decending 
{
	public static void main(String[] args)
	{
		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
		Arrays.sort(array, Collections.reverseOrder()); 
		System.out.println("Array elements in descending order: " +Arrays.toString(array));   



	}

}
