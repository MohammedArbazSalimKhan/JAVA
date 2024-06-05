package collactions;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("Apple");
		set1.add("mango");
		set1.add("Banana");
		set1.add("Chiku");
		set1.add("Orange");
		set1.add("Apple");
		System.out.println("Set Elements are : "+set1);
		int size=set1.size();
		System.out.println("Size of set is : "+size);
		boolean b=set1.contains("Apple");
		System.out.println("Set contain apple is : "+b);
		boolean b1=set1.remove("Chiku");
		System.out.println("Set Elements are : "+set1);
		System.out.println("Size of set is : "+set1.size());
		


		
		

	}

}
