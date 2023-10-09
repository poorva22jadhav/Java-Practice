class negativeNumberSort{
      public static void main(String args[]){
             int ar1[]={1,2,-3,4,-7,-8,-9};
             int size=ar1.length;
             negativeSort(ar1,size);

             }


     static void negativeSort(int ar1[],int size){
            for(int i=0;i<size;i++){
                for(int j=0;j<size-1;j++){
                   if(ar1[j+1]<ar1[j]){
                      int temp=ar1[j];
                      ar1[j]=ar1[j+1];
                      ar1[j+1]=temp;
                                    }
                                      }
                                         }

           for(int element:ar1){
               System.out.println(element);
                                }
                                            }
                                                 }
