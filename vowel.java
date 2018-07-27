import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char d=sc.next().charAt(0);
		System.out.println("Input:\n" +d);
		if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
		{
			System.out.println("Vowel:" +d);
		}
		else
		{
			System.out.println(" Consonant:" +d);
		}
	}
}
