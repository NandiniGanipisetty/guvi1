/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean flag;        
    int d, k,n,x;                        
    for (n = 2; n < 10; n ++)

    {

      if (n == 2)

        flag = true;             

      else if ((n % 2) == 0)

        flag = false;            

      else

      {

        flag = true;              

        k = (int) Math.sqrt((double) n);

        for (d = 3; d <= k; d = d + 2)

        {
          if ((n % d) == 0)       

            flag = false;         // yes, n is not prime
        }

      }

      if (flag)                   // is this number prime?

        System.out.print(n + "  ");

    }

  }
}

