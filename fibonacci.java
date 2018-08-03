/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. *


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,n3,count;
		count=sc.nextInt();
		for(int i=0;i<count-1;i++)
		{
			n3=n1+n2;
			System.out.println("  "+n3);
			n1=n2;
			n2=n3;
		}
		
		

	}
}
