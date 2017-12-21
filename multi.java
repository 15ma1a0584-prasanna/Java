import java.util.Scanner;
public class multi {
      public static void main(String[] args) {
      int i,n,mul;
      Scanner scan=new Scanner(System.in);
      System.out.print("enter the variable ");
      n=scan.nextInt();
      for(i=1;i<=10;i++)
      {
          mul=i*n;
          System.out.println(n+"*"+i+"="+mul);
      }
        
    }
 
}

