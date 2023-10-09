import java.util.*;
class pattern{
      public static void main(String args[]){
             System.out.println("Enter number of rows");
             Scanner sc=new Scanner(System.in);
             int rows=sc.nextInt();

                 int num=1;
                 int temp=1;
              for(int i=1;i<=rows;i++){
                     num=temp; 
                  for(int j=1;j<=i;j++){
                      System.out.print(num+" ");
                      num--;
                     
                       }

                   for(int k=1;k<=rows-i;k++){
                       System.out.print("  ");
                       }

                   System.out.println();
                   temp++;
                   temp++;
                  }

                   temp=temp-4;
              for(int p=1;p<=rows-1;p++){
                  int num2=temp;
                  for(int q=1;q<=rows-p;q++){
                     System.out.print(num2+" ");
                     num2--;
                          }


                 for(int m=1;m<=p;m++){
                     System.out.print("  ");
                        }

                  System.out.println();
                  temp--;
                  temp--;
                   }
       }    }