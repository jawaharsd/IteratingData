package IterationData;

import java.util.Arrays;

public class IteratingStringData {
	private static String data[] =  { "Mahesh", "Preet", "Keshav","Nikhil","Jawahar","Sahas", "Mohan"," Srinivas"}; 

	public static int iterativeSearch (String d[], String  g) { 
		 System.out.println("Before sorting  :"+ "Mahesh"+ "Preet"+ "Keshav"+"Nikhil"+"Jawahar"+"Sahas"+ "Mohan"+" Srinivas");
		 Arrays.sort(data);
		 System.out.println("After sorting data  :"  + Arrays.toString(data));
		 
		int ndx = 0; 
	    while (ndx < d. length && d[ndx] != g) ndx++;
	    if (ndx >=d. length) return -1; 
	    if (g == d[ndx]) return ndx;
	    else return -1; 
	}
	public static void main (String [] args) { 
		String  goal = "Jawahar";
	    
	    int result = iterativeSearch(data, goal); 
	    if (result < 0) 
	    System.out.println("The search could not find: " + goal);
	  else 
	    System.out.println("The goal of " + goal + " was found at index: " + result);
	}
}
