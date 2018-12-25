package com.slokam;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	
	public Map<PersonPojo, Integer> testName() {
		
		Map<PersonPojo, Integer> map=new HashMap<>();
		
		PersonPojo p=new PersonPojo();
		p.setId(1);
		p.setName("daya");
		p.setAge("24");
		
		PersonPojo p1=new PersonPojo();
		p1.setId(2);
		p1.setName("shyam");
		p1.setAge("23");
		
		map.put(p, 1);
		map.put(p1, 2);
		
	    return map;
	}
	
	
	public List<String> testName1() {

		Map<PersonPojo, Integer> map = new HashMap<>();

		PersonPojo p = new PersonPojo();
		p.setName("daya");

		PersonPojo p1 = new PersonPojo();
		p1.setName("shyam");
		PersonPojo p2 = new PersonPojo();
		p2.setName("jeevan");
		PersonPojo p3 = new PersonPojo();
		p3.setName("sraavan");
		
		map.put(p, 1);
		map.put(p1, 2);
		map.put(p2, 3);
		map.put(p3, 4);

		Collection<PersonPojo> name = map.keySet();
    
		//Set<PersonPojo> set=map.keySet();
		List<String> list = new ArrayList<>();

		for (PersonPojo personPojo : name) {
			String name1 = personPojo.getName();

			list.add(name1);
		}
		return list;
	}
	
	public List<String> testName2() {

		Map<PersonPojo, Integer> map = new HashMap<>();

		PersonPojo p = new PersonPojo();
		p.setName("daya");

		PersonPojo p1 = new PersonPojo();
		p1.setName("shyam");
		PersonPojo p2 = new PersonPojo();
		p2.setName("jeevan");
		PersonPojo p3 = new PersonPojo();
		p3.setName("sraavan");
		map.put(p, 1);
		map.put(p1, 2);
		map.put(p2, 3);
		map.put(p3, 4);

		List<String> list = new ArrayList<>();
		
		Set<Entry<PersonPojo, Integer>> names = map.entrySet();

		
		names.forEach((v)->{
			
		PersonPojo st=	v.getKey();
		
		String s=st.getName();
		
		list.add(s);
		});

	
		return list;
	}
}
