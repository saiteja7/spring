package com.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Test{
//	Input: aabbaabccd
//	output: a4b3c2d1
	
	public static void main(String[] args) {
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		StringBuffer b = new StringBuffer("");
		String input = "aabbaabccd";
		for(int i=0;i<input.length();i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i)+1,1));
//			if(map.containsKey(input.charAt(i))) {
//				map.put(input.charAt(i), map.get(input.charAt(i))+1);
//			}else {
//				map.put(input.charAt(i),1);
//			}
	
		}
		for(int i=0;i<input.length();i++) {
			b.append(input.charAt(i));
			b.append(map.get(input.charAt(i)));
		}
		System.out.println(map.toString());
		System.out.println(b.toString());
//		Iterator i = map.entrySet();
Hashtable table = new Hashtable<>();

		
		table.put(1, "1");
		table.put(1, "2");
		System.out.println(table);
		String s1="test";
		String s2 ="test";
		String s3 = new String("test");
		System.out.println(s1.equals("test"));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
	
	
}
