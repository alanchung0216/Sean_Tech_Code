package com.sean_tech_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * here is an example to apply sort capability
http://www.javatpoint.com/Comparable-interface-in-collection-framework
Example of Sorting the elements of List that contains user-defined class objects on age basis
Student.java

1. class Student implements Comparable{  
2. int rollno;  
3. String name;  
4. int age;  
5. Student(int rollno,String name,int age){  
6. this.rollno=rollno;  
7. this.name=name;  
8. this.age=age;  
9. }  
10.   
11. public int compareTo(Object obj){  
12. Student st=(Student)obj;  
13. if(age==st.age)  
14. return 0;  
15. else if(age>st.age)  
16. return 1;  
17. else  
18. return -1;  
19. }  
20.   
21. }  
Simple.java

1. import java.util.*;  
2. import java.io.*;  
3.   
4. class TestSort3{  
5. public static void main(String args[]){  
6.   
7. ArrayList al=new ArrayList();  
8. al.add(new Student(101,"Vijay",23));  
9. al.add(new Student(106,"Ajay",27));  
10. al.add(new Student(105,"Jai",21));  
11.   
12. Collections.sort(al);  
13. Iterator itr=al.iterator();  
14. while(itr.hasNext()){  
15. Student st=(Student)itr.next();  
16. System.out.println(st.rollno+""+st.name+""+st.age);  
17.   }  
18. }  
19. }  
Test it Now
Output:105 Jai 21
       101 Vijay 23
       106 Ajay 27


 */
/*
 * 4)Implement a linked list, without using any container classes from the collections packages.
Create a linked list class that has a constructor that indicates whether or not the list is sorted.
Use the appropriate interface in the collections package that indicates that the nodes support sorting, 
and make sure to provide sorting by implementing this interface.
Sorting should be applied only at the time a node is added 
*/

class LNODE implements Comparable<LNODE>{
	public Integer id;
	public LNODE next;
	@Override
    public int compareTo(LNODE other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
        int ret = this.id.compareTo(other.id);
        return ret;
    }
}

class Linklist<LNODE> {
	public LNODE head;
	public LNODE current;
	int count;

	public void add(LNODE node) {	
		if (head == null){
			head = new LNODE();
			current = head;
		}
		while (current.next != null){
			current = current.next;	
		}
		current.id = node.id;
		current.next = node;	
	}
	public void printlist(){
		current = head;
		while (current.next != null){
			System.out.println(current.id);
			current = current.next;
		}
	}
}

public class linkedListSortDemo {

	public static void main(String[] args) {
		Integer[] array = {7, 4, 66, 2, 9};
		// create a linked list
		Linklist ll = new Linklist();
		for (int i=0; i < array.length; i++){
			LNODE nd = new LNODE();
			nd.id = array[i];
			ll.add(nd);
		} 
		ll.printlist();
		Collections.sort(ll);
		ll.printlist();
	}
}
