package com.arvind.nagar.core.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapVsListPerformance {

	public static void main(String[] args) {
		try {
			List<Integer> list = new ArrayList<>();
			Map<Integer, Integer> map = new HashMap<>();
			long startTime = System.currentTimeMillis();
			for(int i = 0; i<9999999; i++) {
				list.add(i);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("LIst Insertion Time : "+(endTime-startTime));
			
			startTime = System.currentTimeMillis();
			for(int i = 0; i<9999999; i++) {
				map.put(i, i);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Map Insertion Time : "+(endTime-startTime));
			
			startTime = System.currentTimeMillis();
			int value = list.get(9999998);
			endTime = System.currentTimeMillis();
			System.out.println("List Search Time : "+(endTime-startTime));

			startTime = System.currentTimeMillis();
			int value1 = map.get(9999998);
			endTime = System.currentTimeMillis();
			System.out.println("Map Search Time : "+(endTime-startTime));
			
			startTime = System.currentTimeMillis();
			list.remove(1);
			endTime = System.currentTimeMillis();
			System.out.println("List deletion Time : "+(endTime-startTime));
			
			startTime = System.currentTimeMillis();
			map.remove(9999998);
			endTime = System.currentTimeMillis();
			System.out.println("List deletion Time : "+(endTime-startTime));

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
