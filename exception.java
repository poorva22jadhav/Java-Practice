import java.io.*;
class demo{
      public static void main(String args[])throws IOException
{

             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

             String str=br.readLine();
             System.out.println(str);

            int data=0;

              try{
                  data= Integer.parseInt(br.readLine());
                 }

              catch(NumberFormatException nex){
                    System.out.println("Please enter integer data");
                    data= Integer.parseInt(br.readLine());
                    }
             catch(RuntimeException nex){
                     System.out.println("Please enter integer data");
                    data= Integer.parseInt(br.readLine());

              }

              System.out.println(data); 
             System.out.println("End main");

                }
           }