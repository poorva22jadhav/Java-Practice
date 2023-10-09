import java.io.*;

class problem13{

                     

                static  void middleChar(String str1){

                                int num1=str1.length();
                                System.out.println("length is "+num1);
                                 }



                            
                                 
                                  

                 public static void main(String args[]) throws IOException{

                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                    System.out.println("Enter the input");
                                    String str = br.readLine(); 

                                    middleChar(str);

                                    }

                                         }
                                         
             