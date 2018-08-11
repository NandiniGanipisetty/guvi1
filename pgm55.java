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
		int n;
		n=sc.nextInt();
		n=n-1;
		if((n)%2==0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n+1);
		}
	}
}
