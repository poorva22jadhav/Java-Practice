class problem9{
       public static void main (String args[]){
                   int N=2344589;
                   int sum=0;
                   int mult=1;

                    while(N!=0){
                          int x=N%10;
                          if(x%2==0){
                                sum=sum + x;
                            }

                          else if(x%2==1){
                                   mult=mult*x;
                             }

                           N=N/10;
                                   }
                           
                           System.out.println("Sum of even digits is "+sum);
                           System.out.println("multiplication of odd digits is "+mult);
                                         }
                                              }