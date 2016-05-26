package com.sean_tech_code;
/*
 * 3)Write a class that:
Has private state.
Has method(s) that read/write the private state.
Allows for concurrent access by multiple threads.
 */

class DataObj {
	private int counter;
	public void readObj(){
		counter--;
		System.out.println("readObj counter "+ counter);
	}
	public void writeObj(){
		counter++;
		System.out.println("writeObj counter "+ counter);
	}
}

class ReadThread extends Thread {
	DataObj datao;
	ReadThread(DataObj dao){
		datao = dao;
	}
	public void run() {                                
		System.out.println("ReadThread started ");
		synchronized(datao) {
			datao.readObj();
		}
	}
}

class WriteThread extends Thread {
	DataObj datao;
	WriteThread(DataObj dao){
		datao = dao;
	}
	public void run() {                                
		System.out.println("WriteThread started ");
		synchronized(datao) {
			datao.writeObj();			
	    }
	}
}
public class multithread_demo {

	public static void main(String[] args) {
		DataObj dao = new DataObj();
		Thread t1 = new Thread(new WriteThread(dao));
		Thread t2 = new Thread(new ReadThread(dao));
		t1.start();// because synchronized on datao, write is always first
		t2.start();
	}

}
