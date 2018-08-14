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
		String sh=sc.next();
		int i,count=0;
	for( i=0;i<sh.length();i++)
        {
            if(sh.charAt(i)=='a'||sh.charAt(i)=='e'||sh.charAt(i)=='i'||sh.charAt(i)=='o'|| sh.charAt(i)=='u')
        {
        count++;
          System.out.println("yes");
          break;
        }
        
        }
        if(count==0)
        {
            System.out.println("no");
        }
}
}
