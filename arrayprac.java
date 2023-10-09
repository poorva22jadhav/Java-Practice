import java.io.*;

class array1{
      public static void main(String args[])throws IOException{

               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               int array [] = new int [4];
                 System.out.println("Enter your input");
                
               for(int i=0;i < array.length;i++){
                        
                   array[i] = Integer.parseInt(br.readLine());

                                      }

             for(int b=0;b< array.length;b++) {
                        System.out.println(array[b]);
                                        }

                         }

                                }