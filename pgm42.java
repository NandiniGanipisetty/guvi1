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
		String s1,s2;
		s1=sc.next();
		s2=sc.next();
		if(s1==s2)
		{
			System.out.println(s1+s2);
		}
		else if(s1.length()>s2.length())
		{
			System.out.println(s1);
		}
		else
		{
			System.out.println(s2);
		}
	}
}
