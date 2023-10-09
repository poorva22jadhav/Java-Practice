import java.io.*;
import java.util.*;

class sortIncreaseNdecrease{
      public static void main(String args[]){
             int ar1[]={7,3,5,1,2,9,6};
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the value of N");
             int N=sc.nextInt();
             System.out.println("sorted array would be");
             sortedArray(ar1,N);

             }

      
     static void sortedArray(int ar1[],int random){

             for(int i=0;i<ar1.length;i++){
             
                for(int j=0;j<=random-2;j++){
                    if(ar1[j]>ar1[j+1]){
                       int temp=ar1[j];
                       ar1[j]=ar1[j+1];
                       ar1[j+1]=temp;
                    }
                       
                      }

                for(int k=random;k<ar1.length-1;k++){
                    if(ar1[k]<ar1[k+1]){
                       int temp=ar1[k];
                       ar1[k]=ar1[k+1];
                       ar1[k+1]=temp;
                    }
                       }
                          }
                          
                for(int element:ar1){
                    System.out.println(element);
                                   }
                                    

               
              }
                 }
                          