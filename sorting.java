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
		int a[]=new int[10];
		int n,i=0,j;
		n=sc.nextInt();
		System.out.println("Input:"+n);
		//System.out.println(" "+n);
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		//	System.out.println();
		//	System.out.print("  "+a[i]);
		}
		int temp=a[0];
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			//System.out.println();
            		System.out.print("  "+a[i]);
		}
	}

}
