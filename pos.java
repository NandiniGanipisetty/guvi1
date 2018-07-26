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
		if(num==0)
		{
			System.out.println("number is neither positive nor negative");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is positive");
		}
	}
}
