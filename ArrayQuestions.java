
import java.util.*;
class arraySort{
      public static void main(String args[]){
             int ar1[]={3,4,1,2,3,4,5};
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the index");
             int a=sc.nextInt();
             
             int answer[]=sortArray(ar1,a);
             for(int element:ar1){
                 System.out.print(element+" ");
                  }
             
              }


     static int[] sortArray(int ar1[],int a){
            for(int i=0;i<a;i++){
               for(int j=0;j<a;j++){
                  if(ar1[j]>ar1[j+1]){
                    int temp=ar1[j];
                    ar1[j]=ar1[j+1];
                    ar1[j+1]=temp;
                  }
             }
          }
              return ar1;
         }
      }
                      