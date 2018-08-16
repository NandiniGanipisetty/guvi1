import java.util.Arrays;
import java.util.Scanner;
 class Ideone2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       String n=s.next();
       char ch[]=n.toCharArray();
       Arrays.sort(ch);
       String m="";
       for(int i=0;i<ch.length;i++)
       {
    	 m+=ch[i];  
       }
       System.out.println(m);
	}

}
