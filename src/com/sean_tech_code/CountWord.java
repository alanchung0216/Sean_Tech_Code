package com.sean_tech_code;

import java.util.ArrayList;
import java.util.List;

/*
 * 2)Implement a class that counts words.
The class should have a method to add a word to the counter class.
The class should have a method to print the words and their counts to standard output.
Create a main() method that can receive a list of words on the command line, and add the words from the 
command line to the counter.
Print the counter’s contents to standard output.
 */
/*
public class CountWord {
	int count;
	void add(){
		count++;
	}
	void print(List<String> list){
		System.out.println("word "+ list + "\ncount "+ count);
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		CountWord cw = new CountWord();
		for (int i=0; i<args.length; i++){
			list.add(args[i]);
			cw.add();
		}
		cw.print(list);
	}

}
*/

public class CountWord {
	int count;
	List<String> list = new ArrayList<String>();
	void addWord(String s) {
		list.add(s);
		count++;
	}
	void print() {
		System.out.println("word " + list + "\n count " + count);
	}
	public static void main(String[] args){
		CountWord cw = new CountWord();
		for (int i=0; i<args.length; i++){
			cw.addWord(args[i]);
		}
		cw.print();
	}
}
