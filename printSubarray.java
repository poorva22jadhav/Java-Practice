class subArray{
      public static void main(String args[]){
             int ar1[]={4,2,10,3,12,-2,15};
             int size=ar1.length;
             printSubarray(ar1,size);
             }

     static void printSubarray(int ar1[],int size){
               
                  for(int i=0;i<size;i++){
                     for(int j=0;j<size;j++){
                         for(int k=i;k<=j;k++){
                             System.out.print(ar1[k]+" ");
                             
                           }
                           System.out.println();

                      
                       }
                      }

                     
                    }
                
            }