package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class learning {

	public static void main(String[] args) {
		//Creating a list
		List<Integer> numList = new LinkedList<>();
		numList.add(10);
		numList.add(new Integer(22));
		numList.add(new Integer(12));
		
		// Using list
		System.out.print(numList.get(2));
		


	}

}
