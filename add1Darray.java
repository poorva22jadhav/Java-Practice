import java.io.*;
import java.util.*;


class addArray{
      public static void main(String args[])throws IOException{
             BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
           
             System.out.println("Enter size of your first array");
             int size=Integer.parseInt(br.readLine());
             int ar1[]=new int[size];
             System.out.println("Enter element in array");
             for(int i=0;i<size;i++){
                 ar1[i]=Integer.parseInt(br.readLine());
                       }


              System.out.println("Enter size of your second array");
             int size2=Integer.parseInt(br.readLine());
             int ar2[]=new int[size2];
             System.out.println("Enter element in array");
             for(int j=0;j<size;j++){
                 ar2[j]=Integer.parseInt(br.readLine());
                       }

            System.out.println("New Array would be");     

            int ar3[]=new int[size];
           
            for(int k=0;k<size;k++){
                ar3[k]=ar1[k]+ar2[k];
                System.out.println(ar3[k]);
                  }
                               
                                  }
                                        }
                       
             