/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main(String args[]){
	String a;
	Scanner in=new Scanner(System.in);
	a=in.next();
	String b=a.replaceAll("[^01]","");
	if(b.equals(a)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	in.close();
	}
}
