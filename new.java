import java.util.*;
class Ideone1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s[]={" ","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        for(int i=0;i<s.length;i++)
        {
            if(s1.equals(s[i]))
            {
                System.out.print(i);
            }
        }
    }
}
