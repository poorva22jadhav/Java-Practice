class findMaxSum{
    public static void main(String args[]){
      int ar1[]={5,5,10,100,10,5};
      int size=ar1.length;
      findMaxSum(ar1,size);
                   }

     static void findMaxSum(int ar1[],int size){
            
            int max=ar1[0];
            for(int i=0;i<ar1.length;i++){
                int sum=0;
                for(int j=i;j<ar1.length;j=j+2){
                    sum=sum+ar1[j];
                   }
                
                if(sum>max){
                  max=sum;
                 }
             }

            System.out.println(max);
                                        }
                                           }

               
             