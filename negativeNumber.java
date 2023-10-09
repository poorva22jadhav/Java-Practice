class negativeNumbers{
       public static void main(String args[]){
              int ar1[]={-2,7,2,-4,-6,-5,4};
              int size=ar1.length;
              negativeNumber(ar1,size);
      
              }

       public static void negativeNumber(int ar1[],int size){
              int k=ar1.length-1;
                 int i=0;
                
                 for(i=0;i<size;i++){
                
                 
                  if(ar1[k]<0){
                        k--;
                      }
 
                  if(ar1[i]<0){
                     int temp=ar1[k];
                     ar1[k]=ar1[i];
                     ar1[i]=temp;
                     k--;
                   
                         }

                 if(i==k ){
                     break;
                    }

                  
                            
                                 }
             for(int element:ar1){
                 System.out.println(element);
                           }
                                }
                                    }


















       