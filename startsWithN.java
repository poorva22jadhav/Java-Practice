import java.io.*;
import java.util.*;

class twoD{
      public static void main(String args[])throws IOException{


             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter number of rows");
             int rows=Integer.parseInt(br.readLine());
             System.out.println("Enter the number of columns");
             int columns=Integer.parseInt(br.readLine());
             System.out.println("Enter the value of N");
             int N=Integer.parseInt(br.readLine());
             
             int arr[][]=new int[rows][columns];
             System.out.println("Starts with N");
             startsWithN(rows,columns,arr,N);
             System.out.println("Ends with N");
             endsWithN(rows,columns,arr,N);
             }

      static void startsWithN(int rows,int columns,int arr[][],int N){
             
              int l=0;
             for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                  
                    arr[i][j]=(N*10)+l;
                    l+=1;
                 }
                   }
              
               for(int k=0;k<arr.length;k++){
                for(int m=0;m<arr[k].length;m++) {
                  System.out.print(arr[k][m]+" ");
                 }
               
                System.out.println();
                   }
               

                          }



     static void endsWithN(int rows,int columns,int arr[][],int N){
             
              int l=0;
             for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                  
                    arr[i][j]=(l*10)+N;
                    l+=1;
                 }
                   }
              
               for(int k=0;k<arr.length;k++){
                for(int m=0;m<arr[k].length;m++) {
                  System.out.print(arr[k][m]+" ");
                 }
               
                System.out.println();
                   }
               

                          }
                            }
                             