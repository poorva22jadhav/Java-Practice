import java.io.*;

class array15{
      public static void main (String[]args)throws IOException{
              
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of your array");
                int size=Integer.parseInt(br.readLine());

                 int array[]=new int[size];
                

                System.out.println("Enter your input here");
               

                for(int i=0;i<array.length;i++){
                     array[i]=Integer.parseInt(br.readLine());
      
                            }
                     
                          int min=array[0];
                     
                for(int j=0;j<array.length;j++){
                           if(array[j]<min){
                               min=array[j];
                        }
                           
                                                     }
                         System.out.println("min number is "+min);
                               
                                                

                                                     }}