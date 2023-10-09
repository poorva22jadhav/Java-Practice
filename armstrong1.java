class ArmstrongNo{
           public static void main(String[]args){
                      int sum=0;
                      int N=234;
                      int temp=N;
                        while(N!=0){
                             int rem= N % 10;
                             sum=sum+(rem*rem*rem);
                             N=N/10;
                                  }

                          if(temp==sum){
                                 System.out.println(temp+ "is armstrong number");         

                                        }
                          else{
                                   System.out.println(temp+" is not armstrong number");
                                              } 

                                                      }
                                                            }

                       
                              