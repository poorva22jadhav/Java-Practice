class secondLargest{
     public static void main(String args[]){
             int ar1[]={21,2,34,43,777,1,4};
             int ar2[]={3,2,45,12,333,46};
             int size=ar1.length;
             int size2=ar2.length;
             sort(ar1,size);
             secondLargest(ar1,size);
             secondLargestAp2(ar2,size2);
          }


     static void sort(int ar1[],int size){

           int start=0;
           int end=size-1;

      while(start!=size){

          
           int minIndex=start;
           
           
           for(int i=start;i<size;i++){

               if(ar1[i]<ar1[minIndex]){
                  
                  minIndex=i;
                                    }

               
             }
              int temp=ar1[start];
              ar1[start]=ar1[minIndex];
              ar1[minIndex]=temp;
              start++;
                       }

            for(int j=0;j<size;j++){
               System.out.println(ar1[j]);
                                   }


    }


    static void secondLargest(int ar1[],int size){
               int end=size-1;
               int secondLargest=ar1[end-1];
               System.out.println("second largest number is "+secondLargest);
                   
     }

    static void secondLargestAp2(int ar2[],int size2){
           int start=0;
           int temp2=start;
           
           
           while(start!=temp2+2){
                 int max=start;

            for(int i=start;i<size2;i++){
               if(ar2[i]>ar2[max]){
                   max=i;
                       }
                          }
               int temp=ar2[start];
               ar2[start]=ar2[max];
               ar2[max]=temp;
               start++;

                           }
           System.out.println("secondlargest number is "+ar2[start-1]);


            }
                    }