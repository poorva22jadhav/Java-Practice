class mergedArray{
      public static void main(String args[]){
              int ar1[]={1,2,3,4,5};
              int ar2[]={ 12, 13, 1, 10, 34, 1 };
              int ar3[]=new int[ar1.length+ar2.length];
              int size=ar1.length;
              int size2=ar2.length;
              merged(ar1,ar2,ar3,size);
              System.out.println("******************");
              reverseArray(ar1,size);
              System.out.println("******************");
              sort(ar2,size2);
              System.out.println("******************");
              largestThree(ar2,size2);
              
              }

          
    static void merged(int ar1[],int ar2[],int ar3[],int size){
              
              for(int i=0;i<size;i++){
                  ar3[i]=ar1[i];
                  if(i==ar1.length-1){
                     for(int j=0;j<ar2.length;j++){
                         i++;
                         ar3[i]=ar2[j];
                             }
                                 }
             
                                     }
             
            for(int k=0;k<ar3.length;k++){
                 System.out.println(ar3[k]);
                           }
                               }
        


    
   static void reverseArray(int ar1[],int size){
               int reverseArray[]=new int[ar1.length];

                
                  for(int j=0;j<reverseArray.length;j++){
                   reverseArray[j]=ar1[size-1];
                   size--;
                    
                    System.out.println(reverseArray[j]);
                          }
                   
                                }

    static void sort(int ar2[],int size2){
               int start=0;
               int end=size2-1;
              
              while(start!=size2){
                
                int minIndex=start;

                for(int i=start;i<size2;i++){
                    
                    if(ar2[i]<ar2[minIndex]){
                       minIndex=i;
                       }
                 
              }
                 int temp = ar2[start];
                 ar2[start] = ar2[minIndex];
                 ar2[minIndex] = temp;
                 start++;
                }
         
             for(int j=0;j<size2;j++){
                 System.out.println(ar2[j]);
                  }


              }

    static void largestThree(int ar2[],int size2){
               
               int end=size2-1;
              
            
                
                
                   while(end!=size2-4){
                    System.out.println(ar2[end]);
                    end--;
                    }
           
                     
                        
                              }
                                                          

                                                       
                                                     }
                                                     
             