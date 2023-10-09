import java.io.*;

class array3{
            public static void main(String args[])throws IOException{

                          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


                         
                           System.out.println("Enter size of your array");

                           int N= Integer.parseInt(br.readLine());

                           int arr3[]=new int[N];
                                 
                                 System.out.println("Enter your input below");
                           for (int a=0;a < arr3.length;a++){
                                 
                                arr3[a] = Integer.parseInt(br.readLine());

                               }

                            int count=0;
                            
                            System.out.println("Negative number are as follows");

                            for (int i=0;i < arr3.length;i++){
                                 if (arr3[i]<0){
                                      count++;
                                      System.out.println(arr3[i]);
                                   }

                                 
                               

                               }

                               System.out.println("Total count of negative number is "+count);

                              }
                                  }

                             