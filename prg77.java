import java.util.Scanner;
 
 class Ideone1
 {
	
	public static void main(String[] args) 
	{
		int n, i;
	Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i == 0) 
			{
				System.out.print(" "+i);
			}
		}
	}
}
