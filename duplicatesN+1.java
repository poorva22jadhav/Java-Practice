class duplicatesfromOne{
      public static void main(String args[]){
             int ar1[]={1,3,4,2,2};
             int size=ar1.length;
             System.out.println(duplicatesfromOne(ar1,size));
             System.out.println("-----");
             duplicatesfromOne2(ar1,size);
             }

      static int duplicatesfromOne(int ar1[],int size){
             int k=size-1;
             
             while(k>0){
             int count=0;
             for(int i=0;i<ar1.length;i++){
                
                if(k==ar1[i]){
                 count++;
                     if(count==2){
                        return k;
                        }
                  }

                 
                      }
             k--;
                 }

            return -1;
                       }


   static void duplicatesfromOne2(int ar1[],int size){
               for(int i=0;i<size;i++){
                   for(int j=0;j<size-1;j++){
                       if(ar1[j]>ar1[j+1]){
                          int temp=ar1[j];
                          ar1[j]=ar1[j+1];
                          ar1[j+1]=temp;
                          }
                              }
                                  }
               for(int k=0;k<size;k++){
                  if(ar1[k+1]-ar1[k]==0){
                     System.out.println(ar1[k]);
                     break;
                    }
                       }
                            }
                                 }