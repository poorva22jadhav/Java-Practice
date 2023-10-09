class swapNumbers{
      public static void main(String args[]){
             int ar1[]={1,2,3,4,5,6,7,8};
             int size=ar1.length;
             swapNumber(ar1,size);

             }

       static void swapNumber(int ar1[],int size){
              for(int i=0;i<size; i += 2){
                  int temp=ar1[i];
                  ar1[i]=ar1[i+1];
                  ar1[i+1]=temp;

                  }
               
              for(int element:ar1){
                  System.out.println(element);
                 }
                    }
                       }
                      
