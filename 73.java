import java.util.*;
class Main 
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int l=s.nextInt();
       int r=s.nextInt();
       int found=0;
       for(int i=l+1;i<r;i++)
       {
           int k=i++;
           if(k==n)
           {
               found++;
               System.out.println("yes");
           }
       }
       if(found==0)
       {
           System.out.println("no");
       }
    }
}
