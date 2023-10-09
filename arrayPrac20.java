import java.io.*;

class array14{
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
                            int temp=array[j];
                           

                           while(array[j]!=0){
                                 int rem=array[j]%10;
                                   int fact=1;  
                                     for(int k=1;k<=array[j];k++){
                                             fact=fact*k;
                                     }
                                        sum=sum+fact;
                                        array[j]=array[j]/10;
                               }
                                       if(temp==sum){
                                          System.out.println(temp);
                                                 }
                                                     }

                                                     }}

                         







                        
                      

                
                             
                     

              

                
                                          