/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i=0;
		n=sc.nextInt();
		for( i=0;i<n;i++)
		{
			a[i]=a[i]+1;
			a[i]=sc.nextInt();
			System.out.print("   "+a[i]);
		}
		int max=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
			System.out.println();
			System.out.println("  "+max);
		
	}
}
