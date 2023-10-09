import java.io.*;

class array5{
      public static void main(String args[])throws IOException{

               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.println("Enter size of your array");
               int N = Integer.parseInt(br.readLine());

               int arr5 [] = new int [N];
               int arr6 [] = new int [N];

                 System.out.println("Enter your input");

                
                for(int a=0;a<arr5.length;a++){
                      arr5[a]=Integer.parseInt(br.readLine());
               
                         }

                 for(int i=0;i<arr6.length;i++){
                     arr6[i]=arr5[i];
               
                         }

               System.out.println("arr6[] contains same elements as previous array" );

                  for(int b=0;b<arr6.length;b++){
                        System.out.println(arr6[b]);
               
                         }

                   }

                      }

                 
          
          

           


                              