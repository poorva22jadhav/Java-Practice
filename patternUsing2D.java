import java.io.*;
import java.util.*;

class twoD{
      public static void main(String args[])throws IOException{


             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter number of rows");
             int rows=Integer.parseInt(br.readLine());
             
             
             String arr[][]=new String[rows][rows];
             int num[][]=new int[rows][rows];
             patternCode(rows,arr);
            patternCode2(rows,num);
            
             }

      static void patternCode(int rows,String arr[][]){
             
        
               for(int k=0;k<rows;k++){
                for(int m=0;m<=k;m++) {
                    arr[k][m]="*";
                    System.out.print(arr[k][m]+" ");
                 }
               
                 System.out.println();
                   }


                          }
     static void patternCode2(int rows,int arr[][]){
             
        
               for(int k=0;k<rows;k++){
                for(int m=0;m<=k;m++) {
                    
                    System.out.print(arr[k][m]+" ");
                 }
               
                 System.out.println();
                   }


                          }



   
                            }
                             