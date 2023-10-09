import java.io.*;
import java.util.*;

class sortIncreaseNdecrease{
      public static void main(String args[]){
             int ar1[]={7,3,5,1,2,9,6};
             Scanner sc=new Scanner(System.in);
            
             System.out.println("sorted array would be");
             sort(ar1);

             }

      static void sort(int ar1[]){
          
         for(int j=0;j<ar1.length-1;j++){
             for(int i=0;i<ar1.length-1;i++){
                if(ar1[i]>ar1[i+1]){
                   int temp=ar1[i];
                   ar1[i]=ar1[i+1];
                   ar1[i+1]=temp;
                                    }
                                        }
                                               }
            
             for(int element:ar1){
                 System.out.println(element);
                        }
                                }
                                       }