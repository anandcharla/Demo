/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Display d= new Display();
		MyThread t1=new MyThread(d,"Anand");
		MyThread t2=new MyThread(d,"sai");
		t1.start();
		t2.start();
		
	}
}

class Display
{
	public synchronized void showme(String name)
	{
	  for(int i=0;i<10;i++)
	  {
	  	System.out.println(name);
	  	System.out.println(i);
	  	
	  }
	}
}

class MyThread extends Thread
{
	Display d=new Display();
	String name;
	MyThread(Display d1, String name1)
	{
		this.d=d1;
		this.name=name1;
	}
	public void run()
	{
		d.showme(name);
	}
}
