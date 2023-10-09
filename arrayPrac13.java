import java.io.*;

class array6{
      public static void main (String[]args)throws IOException{
              
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


                 int array1[]={10,20,30,40,50};
                 int array2[]={9,18,27,36,45};
                 int array3[]=new int[10];

                 int ar1=array1.length;
                 int ar2=array2.length;
                 int ar3=array3.length;

             
                  
                  
                 

               for(int i=0;i<5;i++){
                       
                       array3[i]=array1[i];

                            }


             for(int k=0;k<array2.length;k++){
                      
                         array3[ar1+k]=array2[k];

                           }
              
               System.out.println("merged array has following elements");
                 
                for(int j=0;j<array3.length;j++){
                       
                      System.out.print(array3[j]+" ");

                            }
                                            

               
                            

               
                    
                       

            
                                
                                        } }


