import java.io.*;

class array4{
            public static void main(String args[])throws IOException{

                          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                          System.out.println("Enter size of your array");
                              int N = Integer.parseInt(br.readLine());

                          int arr4[]= new int[N];

                                  System.out.println("Enter your input below");
                               
                              for(int i=0; i<arr4.length;i++){
                                      arr4[i]=Integer.parseInt(br.readLine());
                          
                              }
                                      System.out.println();
                                      System.out.println("Array contains following elements");

                              for(int a=0; a < arr4.length;a++){
                                    System.out.print("arr4["+arr4[a]+" ]");
                          
                              }


                               }

                            
                                  }
