import java.io.*;
import java.util.*;
class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[0]+" "+a[n-1]);
    }

}
