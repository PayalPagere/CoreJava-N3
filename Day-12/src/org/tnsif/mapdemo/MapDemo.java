package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//difference between hashmap and linkedhash map

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hash is Unordered
		Map<Integer,String>obj=new HashMap<>();
		obj.put(411001,"MG Road");//Pune same key but different value
		obj.put(422001,"MG Road");//for Nashik
		System.out.println(obj);
		//Unordered
		Map<Integer,String>obj1=new LinkedHashMap<>();
		obj1.put(411001,"MG Road");//Pune same key but different value
		obj1.put(422001,"MG Road");//for Nashik
		System.out.println(obj);
	}

}
