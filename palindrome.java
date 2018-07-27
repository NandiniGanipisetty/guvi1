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
		int sum=0,rev;
		int n=sc.nextInt();
		System.out.println("INPUT:\n"+n);
		int temp=n;
		while(n>0)
		{
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}	
		if(temp==sum)
		{
		
			System.out.println("OUPUT:");
			System.out.println("yes");
		}
		else
		{
			System.out.println("OUTPUT:");
			System.out.println("no");
		}
		
	}
}
