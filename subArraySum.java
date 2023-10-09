import java.io.*;
import java.util.*;

class subArraySum{
      public static void main(String args[])throws IOException{
             int ar1[]={1,4,20,3,10,5};
             int size=ar1.length;
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the sum");
             int num=Integer.parseInt(br.readLine());
             subArraySum( ar1, size, num);
             

              }

      
     static void subArraySum(int ar1[],int size,int num){
            
                 for(int i=0;i<size;i++){
                     int sum=ar1[i];
                    
                     if(sum==num){
                         System.out.println("we found the number"); 
                                   };
                     
                     for(int j=i+1;j<size;j++){
                         sum=sum+ar1[j];
                             if(num==sum){
                             System.out.println("sum found between the indexes "+i+ " and " +j); 
                                   }
                                          } 
                                               }
                    
                      
                     
                         
                     
                                            }
                                                  

                      
                         

                
           
                  }