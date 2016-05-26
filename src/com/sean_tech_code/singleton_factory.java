package com.sean_tech_code;
/*
 * Problems Given to me:
1)Write a singleton class that
Has a factory method that provides access to the single instance of the class.
Has a main() method that accesses the instance.
Invokes a method on the instance that prints “Hello World”

Alan:I added getClient(type) to mimic Factory Method pattern
this singleton_factory is to produce smallCLient or bigCliemnt objects.
if 
 */
interface Client {
	public void printMethod();
}

class smallClient implements Client {
	public void printMethod(){
		System.out.println("Hello World 1");
	}
}
class bigClient implements Client {
	public void printMethod(){
		System.out.println("Hello World 2");
	}
}
public class singleton_factory {
	private static singleton_factory sc;
	static {
		sc = new singleton_factory();
	}
	// this private constructer make sure no one outside can create object
	// except internal member like static block as above
	private singleton_factory(){
		
	}
	public static singleton_factory getInstance(){
		return sc;
	}
	public void testMethod(){
		System.out.println("Hello World");
	}
	public Client getClient(String type){
		if (type == "small")
			return new smallClient();
		else if (type == "big")
			return new bigClient();
		else return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// access singleton factory
		
		singleton_factory obj1 = getInstance();
		singleton_factory obj2 = getInstance();
		obj1.testMethod();
		obj2.testMethod();
		
		// alan: add these to make it factory method 
		obj1.getClient("small").printMethod();
		obj1.getClient("big").printMethod();
	}

}
