import java.util.*;
class Main 
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int l=s.nextInt();
       int r=s.nextInt();
       int count=0;
       for(int i=l+1;i<r;i++)
       {
           int c=i++;
           if(c==n)
           {
               count++;
               System.out.println("yes");
           }
       }
       if(count==0)
       {
           System.out.println("no");
       }
    }
}
