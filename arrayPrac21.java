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
                
                     
                for(int j=0;j<array.length;j++){
                            int sum=0;
                           
                              for(int k=1;k<array[j];k++){
                                  if(array[j]%k==0){
                                       
                                  sum=sum+k;
                                        } }
                             if(array[j]==sum){

                               System.out.println("perfect number is "+array[j]);}
                               
                                               

                            
                           

                            }

                                                     }}