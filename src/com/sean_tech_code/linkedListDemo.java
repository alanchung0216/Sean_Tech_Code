package com.sean_tech_code;

import java.util.ArrayList;
import java.util.List;

/*
 * 4)Implement a linked list, without using any container classes from the collections packages.
Create a linked list class that has a constructor that indicates whether or not the list is sorted.
Use the appropriate interface in the collections package that indicates that the nodes support sorting, 
and make sure to provide sorting by implementing this interface.
Sorting should be applied only at the time a node is added 

Java provides a class called Collections in the package java.util which contains several 
utilities methods that operate on or return collections. In this class there is a static method 
sort which can be used for sorting an arraylist. 
There are two overloaded versions of sort method and according to Java docs their description is -

public static <T extends Comparable<? super T>> void sort(List<T> list) - Sorts the specified 
list into ascending order, according to the natural ordering of its elements. All elements in the 
list must implement the Comparable interface. Furthermore, all elements in the list must be 
mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any 
elements e1 and e2 in the list).

public static <T> void sort(List<T> list, Comparator<? super T> c) - Sorts the specified list 
according to the order induced by the specified comparator. All elements in the list must be
 mutually comparable using the specified comparator (that is, c.compare(e1, e2)must not throw 
 a ClassCastException for any elements e1 and e2 in the list).


 */

class Node implements Comparable<Node>{
	private Integer id;
	private Node next;
	public Integer getid(){
		return id;
	}
	public void setid(Integer num){
		id = num;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node n){
		next = n;
	}
	@Override
    public int compareTo(Node other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
        int ret = getid().compareTo(other.getid());
        return ret;
    }
}
/*public class SortListDemo {
    public static void main(String[] args) {
        // Using diamond operator (Right side no type specified)
        // Available from Java7 onwards
        List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        cityList.add("Mumbai");
        // sorting the list in descending order
        Collections.sort(cityList, new MyComparator());
        //Displaying the list
        for(String city : cityList){
            System.out.println("Name " + city);
        }
    }
}


//Custom comparator class
class MyComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }    
}
 * 
 */

class linkedlist extends ArrayList {
	Node head;
	Node current;
	int count;
	public void sort(){
	}
	public void add(Node node) {	
		if (head == null){
			head = new Node();
			current = head;
		}
		while (current.getNext() != null){
			current = current.getNext();	
		}
		current.setid(node.getid());
		current.setNext(node);	
	}
	public void printlist(){
		current = head;
		while (current.getNext() != null){
			System.out.println(current.getid());
			current = current.getNext();
		}
	}
}
public class linkedListDemo {

	public static void main(String[] args) {
		Integer[] array = {7, 4, 66, 2, 9};
		// create a linked list
		linkedlist ll = new linkedlist();
		for (int i=0; i < array.length; i++){
			Node nd = new Node();
			nd.setid(array[i]);
			ll.add(nd);
		} 
		ll.printlist();
	}
}
