package com.myproject.srpingboot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
	
	public static void main(String[] args) {
		
		Set<String> newSet = new HashSet<String>();
		newSet.add("Krishna");
		newSet.add("Krishna12");
		
		List<String> newList = new ArrayList<String>();
		newList.add("ListKrish");
		newList.add("listKrish");
		
		Map<String,String> newMap = new HashMap<String,String>();
		newMap.put("Name", "Krish");
		newMap.put("Occuputation", "IT");
		
		Collection<String> newCol = new HashSet<String>();
		newCol.add("This is collcetions");
		newCol.add("This is second coll line");
		
		for(String str : newCol)
		{
			System.out.println(str);
		}
		
		/*for(String str : newSet)
		{
			System.out.println(str);
		}
		
		for(String str : newList)
		{
			System.out.println(str);
		}
		
		Iterator<Entry<String, String>> itr = newMap.entrySet().iterator();
		while(itr.hasNext())
		{

			System.out.println(itr.next().getValue());
			
		}*/
	}

}
