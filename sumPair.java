import java.io.*;
import java.util.*;

class sumPair{
      public static void main(String args[])throws IOException{
             int ar1[]={2,4,1,6,8,5};
             int size=ar1.length;
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter your sum");
             int num=Integer.parseInt(br.readLine());
             sumPair(ar1,size,num);
             
             
             }


      static void sumPair(int ar1[],int size,int num){
             for(int i=0;i<size;i++){
                
                for(int j=i+1;j<size;j++){
                    int sum=ar1[i];
                    sum=sum+ar1[j];
                   
                    if(sum==num){
                       System.out.println("index "+i+" index "+j);
                                           }
                                             }
                                                }
                                                       }
                                                           }