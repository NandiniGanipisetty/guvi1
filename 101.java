import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		char ch[]=new char[str.length()];int j=0;
		for(int i=str.length()-1;n!=0;i--)
		{
			
			ch[j++]=str.charAt(i);
			n--;
		
		}
		for(int k=str.length()-1;k>=0;k--)
		System.out.print(ch[k]);
	}
}
