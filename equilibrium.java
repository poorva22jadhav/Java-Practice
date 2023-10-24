class equilibrium{
      public static void main(String args[]){
             int ar1[]=new int[]{-7, 1, 5, 2, -4, 3, 0};
             int size=ar1.length;
             //System.out.println(BruteForce(ar1,size));
             System.out.println(Optimized(ar1,size));
               }
 
             static int BruteForce(int ar1[],int size){
                   
                    
                    for(int i=1;i<size;i++){
                        int leftSum=0;
                        int rightSum=0;
                         for(int j=0;j<size;j++){
                            if(j<i){
                               leftSum=leftSum+ar1[j];
                                   }
                            else if(j>i){
                                rightSum=rightSum+ar1[j];
                                  }
                             }
                         if(leftSum==rightSum){
                            return i;
                          }
                        }
                    return -1;
                    }


             static int Optimized(int ar1[],int size){
                   int ar2[]=new int[size];

                   ar2[0]=ar1[0];

                   for(int i=1;i<size;i++){
                       ar2[i]=ar2[i-1]+ar1[i];
                     }
                  for(int j=1;j<size;j++){
                     if(ar2[j-1]==(ar2[size-1]-ar2[j])){
                        return j;
                     }
                   }
     
                  return -1;
              }

                 }