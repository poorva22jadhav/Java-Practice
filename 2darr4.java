class twoDarr{
       
      public static void main(String args[]){
             int arr[][]=new int[4][3];
             int arr2[][]={{12,12},{12,12},{12,12}};

             for(int i=0;i<arr.length;i++){

                 for(int j=0;j<arr[i].length;j++){
                   
                     System.out.print(arr[i][j]+" ");
                           
                       System.out.print(arr[i]+" ");   
                     
                     

                 System.out.println(System.identityHashCode(arr[i][j]));

                            }
           
                 System.out.println();

                             }


        

                             

           for(int[]x:arr2){

                 for(int y:x){

                     System.out.print(y+" ");
                       
                       System.out.println(System.identityHashCode(y));

                         }

                      System.out.println();

                                }



                                                    }

                                                                }