/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		MyThread t = new MyThread("A");
	MyThread t1 =new MyThread("b");
		t.start();
		t1.start();
	//1.start();
	}
}
/*class Dispaly
{
	void showcon(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(name+i);
		}
	}
}*/

 class MyThread extends Thread
{

	String name;
	
	 MyThread(String name)
	{
		this.name=name;
	}
	void showcon(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(name+i);
			try{
			Thread.sleep(1000);
			} catch(InterruptedException e){}
		}
	}
	
	public void run()
	{
		showcon(name);
	}
}
