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
		int reverse=0;
		int a=sc.nextInt();
		while(a>0)//423
		{
		
			int b=a%10;
		reverse=reverse*10+b;
		a/=10;
		
		}
		System.out.println(" "+reverse);
	}
}
