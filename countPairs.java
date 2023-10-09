import java.util.*;
class countPairs{
      public static void main(String args[]){
             int ar1[]={10,12,10,15,-1,7,6,5,4,2,1,1,1};
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the sum");
             int sum=sc.nextInt();
             countPairs(ar1,sum);
             }


      static void countPairs(int ar1[],int sum){
             int count=0;
             for(int i=0;i<ar1.length;i++){
                 for(int j=i+1;j<ar1.length;j++){
                    if(ar1[i]+ar1[j]==sum){
                       count++;
                      }
                         }
                            }
              System.out.println(count);
                                 } }