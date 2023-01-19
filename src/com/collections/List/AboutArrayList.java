package com.collections.List;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * It uses a dynamic array to store the duplicate element of different data types
 * The ArrayList class maintains the insertion order and is non-synchronized
 * The elements stored in the ArrayList class can be randomly accessed
 * Provides the functionality of a resizable array.
 * Manipulation is bit slower because if we add/remove the element it has to shift rest of the elements
 * Reading the values it Bit faster than linkedList.
 * Whenever an instance of ArrayList in Java is created then by default the capacity of Arraylist is 10.
 * ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.
 */

public class AboutArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(4);
		Iterator<Integer> iterable = arrayList.iterator();
		while(iterable.hasNext())
			System.out.println(iterable.next());
		System.out.println(arrayList);
		arrayList.get(2);
		arrayList.indexOf(5);
	}
	
}
