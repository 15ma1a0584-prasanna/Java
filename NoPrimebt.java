import java.util.Scanner;

public class NoPrimebt {
      public static void main(String[] args) {
      int a,i,j,n,m,k=0,num=0;
      Scanner scan=new Scanner(System.in);
      System.out.print("enter the value of lower limit ");
      n=scan.nextInt();
      System.out.print("enter the value of upper limit ");
      m=scan.nextInt();
      for(i=n;i<m;i++)
      {
          for(j=2;j<i;j++)
          {
              if(i%j==0)
              {
                  k=k+1;
              }
          }
          if(k==0)
          {
              num=num+1;
          }
          k=0;
      }
      System.out.print(num);
      }
}

      


