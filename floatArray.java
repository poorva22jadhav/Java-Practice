import java.io.*;
import java.util.*;

class floatMultiply{
      public static void main(String args[])throws IOException{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter your size");
             int size=Integer.parseInt(br.readLine());
             float ar1[]=new float[size];
             
             System.out.println("Enter Elements in array");
             for(int i=0;i<size;i++){
                 ar1[i]=Float.parseFloat(br.readLine());
                 
                }
             
             float multiply=1;
             for(int i=1;i<size; i += 2){
                multiply=multiply*ar1[i];
                 

             }

            System.out.println("multiplication of element at odd index is "+multiply);
             
                        }
                               }

                