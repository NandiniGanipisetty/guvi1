import java.util.*;
 class print12 {
  public static void main(String[]args){
	  int a,i,j,count=0;
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  
	  int b[]=new int[a];
  for(i=0;i<a;i++){
	  b[i]=sc.nextInt();
  }
  for(i=0;i<a;i++){
		for(j=i+1;j<a;j++){ 
			count++;
			if(((1+b[i])!=b[j] && count>2)){
				System.out.println(b[j]-1);
			}
			i++;
			}
		break;
	  
  }
  }
}
