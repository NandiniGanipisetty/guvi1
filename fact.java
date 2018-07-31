/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int fact=1,i=1,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Input:");
		System.out.println(" "+n);
		for(i=1;i<n;i++)
			fact=n*(n-1)*(n-2)*(n-3);
			System.out.println("Ouptut:\n");
			System.out.println("  "+fact);
		
		
	}
}
