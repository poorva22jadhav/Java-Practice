import java.io.*;
import java.util.*;

class removeElement{
      public static void main(String args[])throws IOException{
            int ar1[]={1,2,4,5,6};
            int size=ar1.length;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number to remove");
            int num=Integer.parseInt(br.readLine());
            System.out.println("Elements of an array after removal");
            remove(ar1,size,num);
            }


      static void remove(int ar1[],int size,int num){
             for(int i=0;i<size;i++){
                if(ar1[i]!=num){
                  System.out.println(ar1[i]);
                          }
                         }
                             }
                                   }