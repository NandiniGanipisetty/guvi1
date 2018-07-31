/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rem,a=0,temp;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		temp=x;
		while(temp!=0)
		{
			rem=temp%10;
			a=a+rem*rem*rem;
			temp=temp/10;
		}
		if(a==x)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}
}
