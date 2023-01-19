package com.collections.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector is like the dynamic array which can grow or shrink its size
 * It is recommended to use the Vector class in the thread-safe implementation only
 * Vector is synchronized.
 * Java Vector contains many legacy methods that are not the part of a collections framework.
 * Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.
 * default capacity is 10.
 * Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in runnable or non-runnable state until current thread releases the lock of the object.
 * Vector can use the Iterator interface or Enumeration interface to traverse the elements.
 */
public class AboutVector {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		//uses add function of List interface
		vector.add(1);
		vector.add(3);
		vector.add(5);
		System.out.println("size " + vector.size());
		System.out.println("capacity " + vector.capacity());
		//uses addElement function of vector class
		vector.addElement(7);
		vector.addElement(9);
		vector.addElement(11);
		System.out.println("size " + vector.size());
		System.out.println("capacity " + vector.capacity());
		//retrieve element at specific index same as get function of list
		vector.elementAt(2);
		
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Enumeration<Integer> enumeration = vector.elements();
		while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());
		
	}

}
