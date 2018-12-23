/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone1a
{
                    public static void main(String args[]) throws Exception
           {
                          
                            Scanner s=new Scanner(System.in);
                            String word=s.nextLine();
                            char[] c=word.toCharArray();
                            char cc[]=new char[80];
                            int j=0;
                            for(int i=0;i<c.length;i++)
                                {
                                    if(c[i]== 'a' || c[i]== 'e' || c[i]=='i' || c[i]== '0' || c[i]== 'u')
                                      {
                                          continue;
                                      }
                                    else
                                      {
                                        cc[j]=c[i];
                                         j++;
                                       }
                                 }
                                       System.out.println(cc);
               
	}
}
