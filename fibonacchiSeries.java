
import java.util.*;

class fibonnachiSeries{
      public static void main(String args[]){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the number");
               int m=sc.nextInt();
               System.out.println(fibo(m));
             }

      static int fibo(int n){
              
              if(n<2){
                return n;
                }

           return fibo(n-1)+fibo(n-2);
                  }
                      }