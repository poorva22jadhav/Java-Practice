class arrayDemo{
       
                void fun(int[]arr){
                      arr[1]=170;
                      arr[2]=280;
                                   }





               public static void main(String args[]){
                      int arr[]={240,320,530,640};
                      
                    

                     System.out.println(System.identityHashCode(arr[0]));
                     System.out.println(System.identityHashCode(arr[1]));
                     System.out.println(System.identityHashCode(arr[2]));
                     System.out.println(System.identityHashCode(arr[3]));


                      arrayDemo obj = new arrayDemo();
                      obj.fun(arr);

                      for(int x:arr){
                          System.out.println(x);
                         }


                     System.out.println(System.identityHashCode(arr[1]));
                     System.out.println(System.identityHashCode(arr[2]));


                      int x=170;
                      int y=280;


                     System.out.println(System.identityHashCode(x));
                     System.out.println(System.identityHashCode(y));

                   }
                       }
