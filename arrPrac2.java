import java.io.*;

class array2{
      public static void main(String args[])throws IOException{

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                     System.out.println("Enter the size of your array");
                
                     int N = Integer.parseInt(br.readLine());

                     int arr1 [] = new int [N];

                     System.out.println("Enter your input below");

                     for(int a=0; a<arr1.length;a++){
                        
                          arr1[a]=Integer.parseInt(br.readLine());

                        }

                      int  count1=0;
                      int count2=0;

                for(int i=0;i<arr1.length;i++){
 
                        if(arr1[i]%2==1){
                           count1++;

                           }

                         else{
                             count2++;
                            }
                    }

                         System.out.println("total number of even elements are "+count2);
                         System.out.println("total number of odd elements are "+count1);


                       }

                            }
                         
                              