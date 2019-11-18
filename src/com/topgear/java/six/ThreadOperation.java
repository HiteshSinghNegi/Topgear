package com.topgear.java.six;

/*6.	Write  a  program  to  assign  the  current  thread  to  t1.
 *   Change  the  name  of  the  thread  to  MyThread.  
 *   Display  the  changed  name  of  the  thread.  
 *   Also  it  should  display  the  current  time.  
 *   Put  the  thread  to  sleep  for  10  seconds  and  display  the  time  again.*/

import java.lang.*;
import java.util.Date;

public class ThreadOperation implements Runnable {

	Thread t;

	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("Mythread");
		System.out.println(t1.getName());
		for (int i = 1; i < 3; i++) {
			System.out.println(new Date());

			try {
				// thread to sleep for 1000 milliseconds
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new ThreadOperation());
		// this will call run() function
		t1.start();

	}
}