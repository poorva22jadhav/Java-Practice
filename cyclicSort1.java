class cyclicRotate{
      public static void main(String args[]){
             int ar1[]={3,4,5,6,7,8,9};
             int size=ar1.length;
             cyclicRotate(ar1,size);
            

             }

     static void cyclicRotate(int ar1[],int size){
            int k=size-1;
            int x=ar1[k];
            
            for(int i=size-1;i>=0;i--){
                if(i==0){
                   ar1[i]=x;
                   break;
                 }
         
               ar1[i]=ar1[i-1];

               }

          for(int element:ar1){
              System.out.println(element);
                               }
                                   }
                                          }
       
           