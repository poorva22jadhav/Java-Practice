import java.io.*;

 

class problem21{

             public static void main(String[]args) throws IOException{

                     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                       System.out.println("Enter start number");
                  
                     int start=Integer.parseInt(br.readLine());

                       System.out.println("Enter end number");
                  
                     int end=Integer.parseInt(br.readLine());

                         int count=0;

                 
                    
                      while(start!=end){

                      for(int i=1; i<=start;i++){
                            
                           if(start%i==0){
                                       count++;

                                          } }

                                     if (count==2){
                                     System.out.print(start +" ");
                                         }

                          start++; 

                              

                                   }

                                  
                              

                             

                            

                     
                          


                          }


                    
                       }
                               


                   
