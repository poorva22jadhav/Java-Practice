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
                     int max=array[0];
                     int max1=array[0];
                
                     
                for(int j=0;j<array.length;j++){
                           if(array[j]>max){
                               max=array[j];
                                }

                            if(array[j]<max){
                                  max1=array[j];}
                                    
                                  
                                                     }

                          System.out.println("max number is "+max);
                          System.out.println("secondmax number is "+max1);
                         
                         
                               
                                                

                                                     }}