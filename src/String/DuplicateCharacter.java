package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateCharacter {

 public static void main(String[] args) {
		
	 String s="sdf sdfsdfsd sdfsdfsd sdfsdfsd sdf sdf sdf ";
	    String st[]=s.split(" ");
	    System.out.println(st.length);
	    Map<String, Integer> mp= new TreeMap<String, Integer>();
	    for(int i=0;i<st.length;i++){

	        Integer count=mp.get(st[i]);
	        if(count == null){
	            count=0;
	        }           
	        mp.put(st[i],++count);
	    }
	   System.out.println(mp.size());
	   System.out.println(mp.get("sdfsdfsd"));


	
			
		}}
		
	
	
	
	
	
	
	
	
	
	
	
	
	 
	 
		
		
		
		
		
		

	


