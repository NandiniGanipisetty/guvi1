/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideonejava
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
			System.out.println(n/2);
		else
			System.out.println(n);
		s.close();

	}
}
