import java.io.*;
import java.util.*;

class missingInt{
      public static void main(String args[]){
             int ar1[]={7,3,4,1,2,6,8,10};
            

             Scanner sc=new Scanner(System.in);
             //System.out.println("Enter the range");
             //int N=sc.nextInt();
            
            
            MissingInteger(ar1);
          
            

             }


      static void MissingInteger(int ar1[]){
              for(int i=0;i<ar1.length-1;i++){
                  for(int j=0;j<ar1.length-1;j++){
                      if(ar1[j]>ar1[j+1]){
                         int temp=ar1[j];
                         ar1[j]=ar1[j+1];
                         ar1[j+1]=temp;
                     }
                        }
                             }

               for(int element:ar1){
                  System.out.println(element);
                     }

              for(int k=0;k<ar1.length-1;k++){
                 if(ar1[k+1]-ar1[k]!=1){
                    int m=ar1[k]+1;
                    System.out.println("Missing integer would be "+m);
                    }
                
                 }

            

               
                   
              }



                      
