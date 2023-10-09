import java.io.*;

class array9{
      public static void main (String[]args)throws IOException{
              
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of your array");
                int size=Integer.parseInt(br.readLine());

                 int array[]=new int[size];
                 int sum=0;

                System.out.println("Enter your input here");

                       
                for(int j=0;j<array.length;j++){
                      array[j]=Integer.parseInt(br.readLine());
                            }  

                for(int i=0;i<array.length;i++){
                                 int num = array[i];
                                  

                             while(array[i]!=0){
                                  int rem= array[i]%10;
                                  sum=sum+rem;

                                 array[i]= array[i]/10;


                               }

                                if(sum%2==0){
                                    System.out.println(array[i]);
                                            }

                             


                                

                             

                               }

                   

                                        }}


      

                



                  
                
              
                       

            
                                
                                 
