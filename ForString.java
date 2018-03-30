package SortingData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForString {

	public static void main(String Args[]) {
		
		List<String> lists = new ArrayList<String>();
		lists.add("Preetinder");
		lists.add("Jawahar");
		lists.add("Mahesh");
		lists.add("Keshav");
		lists.add("Nikhil");
		lists.add("Sahas");
		
		Collections.sort(lists);
		
		System.out.println("The sorted data in alphabetic order :"+lists);
		
		Collections.reverse(lists);
		
		System.out.println("The sorted data in reverse alphabetic orders :"+lists);
	}
}
