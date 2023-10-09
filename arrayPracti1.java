
import java.io.*;

class arrayDemo{
      public static void main(String args[]) throws IOException{


      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
      int size=5;


      int arr[]=new int[size];
      int arr2[]=new int[size];

     System.out.println("Enter your input below:");


      for(int a=0; a<arr.length; a++){
              arr[a]=Integer.parseInt(br.readLine());
               

                    }

    for(int x:arr){
                System.out.println(x);
          }


      for(int b=arr.length-1; b>=0; b--){
            arr2[b]=arr[b];


                        }

     for(int c=arr.length-1; c>=0; c--){
            System.out.println(arr[c]);


                        }





                
                


                          }

                                }