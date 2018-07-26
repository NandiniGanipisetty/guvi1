import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Input:"+num);
		if(num>0)
		{
			System.out.println(" positive");
		}
		else
		{
			System.out.println(" negative");
		}
	}
}
