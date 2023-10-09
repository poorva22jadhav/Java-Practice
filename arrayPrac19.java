import java.io.*;

class array11{
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
                            int temp1=array[j];
                            int count=0;
                            
                         while(array[j]!=0){
                               array[j]=array[j]/10;
                               count++;
                                    }
                           

                         while(temp!=0){
                               int rem= temp%10;
                               int product=1;
                                  for(int k=0;k<count;k++){
                                        product=product*rem;
                                     }
                                  sum=sum+product;
                               temp=temp/10;
                           }

                             if(temp1==sum){
                            System.out.println("armstrong number is "+temp1);}
                                       
                                                 }

                                      

                         







                        
                      

                
                             
                     

              

                
                                          }}