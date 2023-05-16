package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2{
 
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] % 2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		

		ArrayList<String> a = new ArrayList<String>();
		//a.addAll(0, "hello");
		a.contains("h");
		a.remove("selenium");
		a.add("Kumar");
		a.add("mike");
		a.add("selenium");
		a.get(0);
		
		System.out.println(a.get(0));
		
		
	}

	
}
