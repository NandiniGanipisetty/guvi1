import java.util.Scanner;

class PrimrOrComposite {
 public static void main(String[] args) {
  int a, b;
  Scanner scan = new Scanner(System.in);
  b = scan.nextInt();
  scan.close();
  for (a = 2; a <= b - 1; a++) {
   if (b % a == 0) {
    System.out.println("yes" );
    break;
   }
  }
  if (b == a)
   System.out.println("no" );
  
 }
}
