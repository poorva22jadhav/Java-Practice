import java.io.*;
import java.util.*;

class twoDarrayOdd{
      public static void main(String args[])throws IOException{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter number of rows");
             int rows=Integer.parseInt(br.readLine());
             System.out.println("Enter the number of columns");
             int columns=Integer.parseInt(br.readLine());
             int arr[][]=new int[rows][columns];
             oddTwoDArray(rows,columns,arr); 
             }

      static void oddTwoDArray(int rows,int columns,int arr[][]){
             int odd=1;
             for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    arr[i][j]=odd;
                    odd+=2;
                 }
                   }
             for(int row[]:arr){
                 for(int element:row){
                     System.out.println(element);
                     }
                          }
                            }
                                   }