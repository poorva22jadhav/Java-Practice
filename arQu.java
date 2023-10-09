class Array{
      public static void main(String args[]){
             int ar1[]={3,4,5,6,7,8};
             int size=ar1.length;
             int median=findMedian(ar1,size);
             System.out.println(median);

             }

      static int findMedian(int ar1[],int size){
                  if(size%2==1){
                    return ar1[size/2];
                   }

                  else{
                      return ar1[size/2-1]+ar1[size/2]/2;
                       }
                    }
              }