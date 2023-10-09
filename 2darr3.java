class twoD2{
         public static void main(String args[]){
                int arr[][]=new int[3][2];

                arr[0][0]=10;
		arr[0][1]=11;
		arr[1][0]=12;
		arr[1][1]=13;
                arr[2][0]=14;
		arr[2][1]=15;

                      
                   System.out.println(arr);
                   System.out.println(arr[0]);
                   System.out.println(arr[1]);
                   System.out.println(arr[2]);
                   System.out.println(arr[1][1]); 

                 System.out.println(System.identityHashCode(arr[0][0]));
                 System.out.println(System.identityHashCode(arr[0][1]));
                 System.out.println(System.identityHashCode(arr[1][0]));
                 System.out.println(System.identityHashCode(arr[1][1]));
                 System.out.println(System.identityHashCode(arr[2][0]));
                 System.out.println(System.identityHashCode(arr[2][1]));
                       

                                }
                                    } 
		