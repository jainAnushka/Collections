package com.collections.set;

import java.util.*;

public class SetFirst {
	
	public static void main(String args[])
	{
		//System.out.println("hi");
		boolean flag;
		int t[] = {34, 93,12, 73, 92, 40};
		Set <Integer> s= new  HashSet<Integer>();
		Set <Integer> s1 = new HashSet<Integer>();
		s.add(10);
		
		
		
		for (Integer a : t){
			s.add(a);
			}
			//System.out.println(s.size() + " distinct word " + s);
			//s.clear();
			//flag = s.isEmpty();
			//System.out.println(flag);
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		if(!(it.hasNext()))
{ System.out.println("i m here");
	it.remove();
	System.out.println(s);
}
		
	}
}

