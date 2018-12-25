package com.slokam;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainTest {

	
	public static void main1(String[] args) {
		
		HashMapTest mapTest=new HashMapTest();
		
		Map<PersonPojo, Integer> map=mapTest.testName();
		
	
		 Set<PersonPojo> values=map.keySet();
		 
	       for (PersonPojo personPojo : values) {
			
	    	  String name= personPojo.getName();
	    	  
	    	  System.out.println(name);
		}
	}
	
	public static void main2(String[] args) {
		
		HashMapTest mapTest=new HashMapTest();
		
		List<String> names=mapTest.testName1();
		
		names.forEach((v)->{
			System.out.println(v);
		});
		
	}
	
public static void main(String[] args) {
		
		HashMapTest mapTest=new HashMapTest();
		
		List<String> names=mapTest.testName2();
		
		names.forEach((v)->{
			System.out.println(v);
		});
		
	}
}
