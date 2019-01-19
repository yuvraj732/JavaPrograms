package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ThirdMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,2,7,9,40,38,45,38,19,20,19,1,37,50,33,85,81,85};
		//Problem :: Sort, Remove duplicates, and find 3 largest in this array 
		//using optimized approach 
				
		Set <Integer> s=new HashSet<Integer>();
		for (int i : arr) {
		s.add(i);
		}
		
	//Converting Set to AL
		ArrayList <Integer> al=new ArrayList <Integer>(s);
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Third largest element -=");
		System.out.println(al.get(al.size()-3));
     
		
  
	}
}
