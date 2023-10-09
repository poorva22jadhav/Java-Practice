import java.io.*;

class problem22{
     public static void main (String args[]) throws IOException{
            

                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter the input");
                 int input=Integer.parseInt(br.readLine());
                    int sum=0;
                    int fact=1;
                while(input!=0){
                      
                      int num=input%10;
                           
                       for(int i=1;i<=num;i++){
                           fact=fact*i;
                           }

                       input=input/10;
                        sum=sum+fact;
                        fact=1;

                        }

                        

                       System.out.println("Addition of factorials of each digit is "+sum);

                              }}
                      

