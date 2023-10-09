class DutchProblem{
      public static void main(String args[]){
             int ar1[]={0,1,2,0,1,2};
             int size=ar1.length;
             sortingAlgo(ar1,size);
             System.out.println("Using insertion sort");
             InsertionSort(ar1,size);

      }

     
      static void sortingAlgo(int ar1[],int size){

             int start=0;
             while(start!=size){
             
             int temp=ar1[start];
             int minIndex=start;
             for(int i=start;i<size;i++){
                 if(ar1[i]<ar1[minIndex]){
                     minIndex=i;
                         }
                              }
                 ar1[start]=ar1[minIndex];
                 ar1[minIndex]=temp;
                 start++;
                      
                                     }
         for(int j=0;j<size;j++){

            System.out.println(ar1[j]);
                                  }

                                          }


     static void InsertionSort(int ar1[],int size){

            for(int i=0;i<size-1;i++){
               
               for(int j=i+1;j>0;j--){
                   if(ar1[j]<ar1[j-1]){
                          int temp=ar1[j-1];
                          ar1[j-1]=ar1[j];
                          ar1[j]=temp;

                          }
                     
                  else{
                         break;
                      }


                  }
                       }

             for(int k=0;k<size;k++){
                 System.out.println(ar1[k]);
                                    }






                                      }
                                                }
                  
                    