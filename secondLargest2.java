class second{
      public static void main(String args[]){
             int ar1[]={2,4,5,6,7,1,3};
             int ar2[]={1,1,1,1,2,2,3,4,4,4,5,6};
             int size=ar1.length;
             System.out.println(secondLargest(ar1,size));
             removeDuplicates(ar2);
             
             }

      static int secondLargest(int ar1[],int size){
             int max=ar1[0];

             for(int i=0;i<size;i++){
                 if(ar1[i]>max){
                    max=ar1[i];
                   }
               }
            int second =-1;

            for(int i=0;i<size;i++){

                if(ar1[i]>second && ar1[i]!=max){
                   second=ar1[i];
                  }
            }

           return second;
      }


     static void removeDuplicates(int ar1[]){
            int index=0;
             
            for(int i=0;i<ar1.length;i++){
                if(ar1[i]!=ar1[index]){
                index++;
                ar1[index]=ar1[i];
                }
             }
          for(int j=0;j<index+1;j++){
              System.out.print(ar1[j]+" ");
            }
          }
       }      