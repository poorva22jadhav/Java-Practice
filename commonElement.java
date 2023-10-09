class commonElements{
      public static void main(String[]args){
              
              
              int ar1[]={2,3,4,5,6};
              int ar2[]={2,1,9,5};

              int size1=ar1.length;
              int size2=ar2.length;

              common(ar1, size1, ar2,size2);
           
              }


      static void common(int ar1[],int size1,int ar2[],int size2){
             for(int i=0;i<size1;i++){
                 for(int j=0;j<size2;j++){
                     if(ar1[i]==ar2[j]){
                         System.out.println(ar1[i]);
                       }
                     
                           }
                                  }
                                       }
                                              }