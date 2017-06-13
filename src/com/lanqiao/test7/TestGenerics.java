package com.lanqiao.test7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class TestGenerics {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
	}
	
	@Test
	public  void test3() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("hh", 2);
		map.put("ÄãºÃ", 8);
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}
	@Test
	public  void test2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(99);
		for(Integer o : list) {
			System.out.println(o);
		}
	}
	@Test
	public  void test1() {
		List list = new ArrayList();
		list.add(78);
		list.add(97);
		
		for(Object o : list) {
			int i = (Integer)o;
			System.out.println(i);
		}
	}

}
