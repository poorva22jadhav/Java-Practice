class maxsubarraySum{
      public static void main(String args[]){
             int ar1[]={-2,-3,4,-1,-2,1,5,-3};
             int size=ar1.length;
             int num=7;
             maxsubArray(ar1,size,num);

             }

      static void maxsubArray(int ar1[],int size,int num){
             int max=0;
             int index1=0;
             int index2=0;
             
             for(int i=0;i<size-1;i++){
                 int sum=ar1[i];
                 for(int j=i+1;j<size;j++){
                     sum=sum+ar1[j];
                         if(sum>max){
                            max=sum;
                             index1=i;
                             index2=j;
                            }
                            
                                     }
                                        }

            System.out.println(max);
            System.out.println("from "+index1+ " to "+index2);
    
                                             }
                                                      }
             