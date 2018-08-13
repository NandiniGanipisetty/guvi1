import java.util.Scanner;
class Countnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,n1,count=0;
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
n1=ja.nextInt();
int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
for(i=0;i<n;i++){
	if(a[i]==n1){
		count++;
	}
}
System.out.println(count);

	}

}
