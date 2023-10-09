import java.io.*;


 class problem17{
     
       public static void main(String args[]) throws IOException{
 
                     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                     System.out.println("Enter Start Number");

                     int start = Integer.parseInt(br.readLine());

                     System.out.println("Enter End Number");

                     int end = Integer.parseInt(br.readLine());

                                 int num1=end-1;
                                 int num2=start+1;


                    for(int i=1;i<=2;i++){
                                 
                                
                            for(int j=1;j<=4;j++){
                                      if(i%2==1){
                                          System.out.print(num1+" ");
                                          num1=num1-2;

                                      }

                                      else{

                                         System.out.print(num2+" ");
                                         num2=num2+2;

                                      }

                              }

                                    System.out.println();}
                                    }}  

                                        