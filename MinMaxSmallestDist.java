class minMaxSmallestDist{
      public static void main(String args[]){
             int ar1[]={1,2,3,1,3,4,6,4,6,3};
             int length=ar1.length;
             System.out.println(Bruteforce(ar1,length));
             }
    
       static int Bruteforce(int ar1[],int size){
               int max=Integer.MIN_VALUE;
               int min=Integer.MAX_VALUE;
               for(int i=0;i<size;i++){
                  if(ar1[i]>max){
                     max=ar1[i];
                     }
             
                  if(ar1[i]<min){
                    min=ar1[i];
                   }
                }

                int min2=Integer.MIN_VALUE;
                int length=0;
                for(int i=0;i<size;i++){
                    if(ar1[i]==min){
                       for(int j=i+1;j<size;j++){
                           if(ar1[j]==max){
                               length=j-i+1;
                              }
                           }
                         }
                     if(length<min2){
                        min2=length;
                        }

                       }

                  return min2;
                    }
                     
                 }