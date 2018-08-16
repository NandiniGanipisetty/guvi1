/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		String m="";
		for(int i=0;i<n.length();i++)
		{
			if(Character.isDigit(n.charAt(i)))
			{
				m+=n.charAt(i);
			}
		}
		System.out.println(m);
		
	}
}
