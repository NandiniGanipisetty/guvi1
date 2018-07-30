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
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("Input:");
		System.out.println(p+ " " +q);
		//System.out.println(+p);
		//System.out.println(+q);
		for(p=p+1;p<q;p++)
		{
			if(p%2==0)
			{
				System.out.print(" "+p);
			}
		}
	}
}
