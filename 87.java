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
		int a,b,i=1,n,gcd=1;
		a=sc.nextInt();
		b=sc.nextInt();
		
        for(i = 1; i <= a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if(a % i==0 && b % i==0)
                gcd = i;
        }
        System.out.println(gcd);
	}
}
