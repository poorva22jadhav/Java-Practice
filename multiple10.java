import java.io.*;
import java.util.*;

class twoDmultiple{
      public static void main(String args[])throws IOException{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter number of rows");
             int rows=Integer.parseInt(br.readLine());
             System.out.println("Enter the number of columns");
             int columns=Integer.parseInt(br.readLine());
             int arr[][]=new int[rows][columns];
             TwoDArray(rows,columns,arr); 
             }

      static void TwoDArray(int rows,int columns,int arr[][]){
             
              int l=1;
             for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    int multiple=10;
                    arr[i][j]=multiple*l;
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
                                   