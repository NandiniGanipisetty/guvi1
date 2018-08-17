/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone121
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int n,m;
		m=sc.nextInt();
		n=str.length();
		for(int i=(n-m);i<n;i++){
			System.out.print(str.charAt(i));
			
		}
	}
}
