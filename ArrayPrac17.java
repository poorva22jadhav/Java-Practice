import java.io.*;

class array11{
      public static void main (String[]args)throws IOException{
              
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of your array");
                int size=Integer.parseInt(br.readLine());

                 int array[]=new int[size];

                System.out.println("Enter your input here");
               

                for(int i=0;i<array.length;i++){
                     array[i]=Integer.parseInt(br.readLine());


                                
                            }
                     

                for(int j=0;j<array.length;j++){
                            int count=0;
                        for(int k=1;k<=array[j];k++){
                             if(array[j]%k==0){
                                     count++;}
                       
                              }

                        if(count>2){
                            System.out.println("composite number is "+array[j]+" and it is found at index "+j);
                                    }
                                       }

                
                                          }}