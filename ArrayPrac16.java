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
                         
                            
                            int reverse=0;
                      while(array[j]!=0){
                           int rem = array[j]%10;
                             reverse=reverse*10+rem;
                             array[j]=array[j]/10;
                           
                    
                             }
                       System.out.println(reverse);
                       
                              }

                
                                          }}
                      
