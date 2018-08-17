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
		  int num=0;
	       int reversenum =0;
	       Scanner s=new Scanner(System.in);
	       num = s.nextInt();
	       while( num != 0 )
	       {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	}

	       System.out.println(reversenum);
	}
}
