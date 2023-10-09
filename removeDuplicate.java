class duplicateNumber{
      public static void main(String args[]){
             int ar1[]={1,2,2,3,3,3,4,4,5};
             int size=ar1.length;
             removeDuplicate(ar1,size);
             }



      static void removeDuplicate(int ar1[],int size){
              for(int i=1;i<size;i++){
                  if( ar1[i]!=ar1[i-1]){
                     System.out.println(ar1[i]);
                                       }
                                          } 
                                               }


   