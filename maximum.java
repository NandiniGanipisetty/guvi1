/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
     int n=10;
     int c;
     Scanner s=new Scanner(System.in);
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<10;i++){
        c=s.nextInt();
        a.add(c);
     }
   System.out.print(Collections.max(a));
    }
}
