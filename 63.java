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
		int n=10,i,j;

Scanner ja=new Scanner(System.in);

int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
int min=a[1];
	for(j=0;j<n;j++){
	if(min>a[j]){
		min=a[j];
	}
}
System.out.println(min);
	

	}
}
