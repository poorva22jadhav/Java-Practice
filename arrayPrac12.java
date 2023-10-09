import java.io.*;

class array6{
      public static void main (String[]args)throws IOException{
              
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of your array");
                int size=Integer.parseInt(br.readLine());

                 int array1[]=new int[size];
                 int array2[]=new int[size];

                System.out.println("Enter your first array ");

                for(int i=0;i<array1.length;i++){
                     array1[i]=Integer.parseInt(br.readLine());
      
                            }

               

               System.out.println("Enter your second array ");

                    

                for(int j=0;j<array2.length;j++){
                        array2[j]=Integer.parseInt(br.readLine());
                               }

               
                   System.out.println("common elements would be");
                
                 for(int h=0;h<array2.length;h++){
                                     
                                        for(int k=0;k<array1.length;k++){
                                             if(array2[h]==array1[k]){
                                                        System.out.println(array2[h]);
                                                          }


                                }
                                    }
                                        } }



              

                

               
                                         



                  
                
              