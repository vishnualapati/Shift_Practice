package com.collections.List;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure
 * LinkedList class can contain duplicate elements.
 * LinkedList class maintains insertion order, non-synchronized
 * manipulation is fast because no shifting needs to occur.
 * It offer few more methods than ArrayList like addFirst, addLast, getFirst, getLast, removeFirst, removeLast
 * LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
 * LinkedList is better for manipulating data.
 */

public class AboutLinkedList {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("java");
		linkedList.add("springMVC");
		linkedList.add("springBoot");
		//replace the element in specified index
		linkedList.set(1, "spring");
		linkedList.get(2);
		linkedList.indexOf("spring");
		linkedList.addLast("MongoDB");
		System.out.println(linkedList.getLast());
		System.out.println(linkedList);
		//retrieves first(head) element
		System.out.println(linkedList.peek());
		//retrieves and removes first element
		System.out.println(linkedList.poll());
		System.out.println("after removing " + linkedList);
		//retrieves the first element from the stack
		System.out.println(linkedList.pop());
		
		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student(1, "ram", "SMCE"));
		list.add(new Student(3, "bheem", "TEc"));
		list.add(new Student(4, "arjun", "KITS"));
		
		List<Student> collect = list.stream().filter(e -> e.getId()>2).collect(Collectors.toList());
		System.out.println(collect.toString());
	}

}

class Student {
	private int id;
	private String name;
	private String college;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
}
