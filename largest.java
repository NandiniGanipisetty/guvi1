/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:\n");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println(""+d);
		
	}
}