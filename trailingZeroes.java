import java.io.*;
import java.util.*;

class trailZero{
      public static void main(String args[])throws IOException{
             
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the number");
             int num=Integer.parseInt(br.readLine());
             
             

        
             int count=0;
             int reversed_number=0;
             while(num!=0){
                  int number=num%10;
                  reversed_number=(reversed_number*10)+number;  
                  num=num/10;
                  count++;
                       }

            int ar1[]=new int[count];
            for(int i=0;i<ar1.length;i++){
                int Reversed= reversed_number%10;
                ar1[i]=Reversed;
                reversed_number=reversed_number/10;
             
                         }


           for(int element:ar1){
                   System.out.println(element);
                 }

          
           int size=ar1.length; 
           countZero(ar1,size);   
             
             }






      static void countZero(int ar1[],int size){
                  int count=0;
                  int end=size-1;
                  for(int i=end;i>=0;i--){
                      
                      if(ar1[i]==0){
                          count++;
                         }
                      else{
                            break;
                          }
                                 }

                  System.out.println("Number of trailing zeroes "+count);
                                 }
                                      }





      


     