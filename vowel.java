import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s={"a","e","i","o","u"};
		Scanner sc=new Scanner(System.in);
		String d=sc.nextString();
		System.out.println("enter the  alphabet"+d);
		if(d==s)
		{
			System.out.println("the entered element is an vowel:"+d);
		}
		else
		{
			System.out.println("The entered element is a consonant:"+d);
		}
	}
}
