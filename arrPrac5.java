import java.io.*;

class array5{
      public static void main(String args[])throws IOException{

               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.println("Enter size of your array");
               int N = Integer.parseInt(br.readLine());

               int arr5 [] = new int [N];
                 System.out.println("Enter your input");

                int sum=0;


                for(int a=0;a<arr5.length;a++){
                      arr5[a]=Integer.parseInt(br.readLine());
               
                         }


               for(int i=0;i<arr5.length;i++){
                       sum += arr5[i];
               
                         }

                    System.out.println("sum of total elements in array is "+sum);

                                }
                                    }