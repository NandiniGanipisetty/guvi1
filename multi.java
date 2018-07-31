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
		System.out.print("Input:\n");
		n=sc.nextInt();
		System.out.println(n);
		for(i=1;i<=n;i++)
		{
			fact=i*n;
			System.out.print("  "+fact);
		}
	}
}
