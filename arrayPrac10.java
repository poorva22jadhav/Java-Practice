import java.io.*;

class array8{
      public static void main(String args[])throws IOException{

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                    char charArray[]={'a','e','i','o','u'};

                    char[] array=new char[7];
                   
                   
                 

                    for(int i=0;i<array.length;i++){
                         array[i]=(char)br.read();

                         if(array[i]=='a'||array[i]=='e'){
                              System.out.println(array[i]);
                           }
                               
                         }

                 




                   

                   

      



                       }

                            }
                         