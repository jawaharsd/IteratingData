package IterationData;

import java.util.Arrays;

public class IteratingIntData { 
private static int data[] =  { 45,88,98,99,65,43}; //{1,4,7,8,11,15,19,21,25};

public static int iterativeSearch (int d[], int g) { 
	 System.out.println("Before sorting  :"+"{45,88,98,99,65,43}");
	 Arrays.sort(data);
	 System.out.println("After sorting data  :"  + Arrays.toString(data));
	 
	int ndx = 0; 
    while (ndx < d. length && d[ndx] < g) ndx++;
    if (ndx >=d. length) return -1; 
    if (g == d[ndx]) return ndx;
    else return -1; 
}
public static void main (String [] args) { 
    int goal = 43;
    
    int result = iterativeSearch(data, goal); 
    if (result < 0) 
    System.out.println("The search could not find: " + goal);
  else 
    System.out.println("The goal of " + goal + " was found at index: " + result);
}
}
