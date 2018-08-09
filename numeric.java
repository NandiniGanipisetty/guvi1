import java.io.*;
import java.util.*;
class count_numeric{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,count=0;
	String s="";
	s+=sc.nextLine();
int l=s.length();
for(i=0;i<l;i++)
{
	 if(s.charAt(i)>='0'&&s.charAt(i)<='9')
	{
	    count++;
	}
}
	
	System.out.print(count);
	}
}
