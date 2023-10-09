class kadensAlgo{
      public static void main(String args[]){
              int ar1[]={-5,4,6,-3,4,-1};
              int size=ar1.length;
              System.out.println(kadensAlgo(ar1,size));
              
              }

     static int kadensAlgo(int ar1[],int size){

            int maxSum=0;
            int curSum=0;

            for(int i=0;i<size;i++){
                curSum=curSum+ar1[i];
                if(curSum>maxSum){
                   maxSum=curSum;
                   }
                
                if(curSum<0){
                  curSum=0;
                   }
                     }

            return maxSum;
        }
            }
            