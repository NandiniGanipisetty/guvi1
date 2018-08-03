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
		Scanner sc=new Scanner(System.in);
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int h3=h1-h2;
		int m3=m1-m2;
		System.out.println(h3+" "+m3);
		
	}
}
