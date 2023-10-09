class jaggedArray{
      public static void main (String args[]){
                 
               int arr[][] ={{1,2,3},{4,3},{1,4}};

          /*     for(int i=0;i<arr.length;i++){
                     for(int j=0;j<arr[i].length;j++){
                         System.out.print(arr[i][j]+" ");
                               }

                         System.out.println();}
                                                 }  }

         */


                  System.out.println(arr);
                  System.out.println(arr[0]);
                  System.out.println(arr[1]);
                  System.out.println(arr[2]);
                  System.out.println(System.identityHashCode(arr[0][0]));
                  System.out.println(System.identityHashCode(arr[0][1]));
                   System.out.println(System.identityHashCode(arr[0][2]));
                  System.out.println(System.identityHashCode(arr[1][0]));
                   System.out.println(System.identityHashCode(arr[1][1]));


                     }}
                  
