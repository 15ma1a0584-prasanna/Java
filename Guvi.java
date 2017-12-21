import java.util.Scanner;
public class Guvi {
      public static void main(String[] args) {
      int i,n,fact=1;
      Scanner scan=new Scanner(System.in);
      System.out.print("enter the variable ");
      n=scan.nextInt();
      for(i=1;i<=n;i++)
      {
        fact=fact*i;  
      }
        System.out.println("factorial="+fact);
    }
 
}

