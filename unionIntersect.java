class union{
      public static void main(String args[]){
             int ar1[]={2,5,6};
             int ar2[]={4,6,8,10};

             int size1=ar1.length;
             int size2=ar2.length;

             findUnion(ar1,ar2,size1,size2);
             System.out.println("Intersection");
             Intersect(ar1,ar2,size1,size2);
             

             }


      static void Intersect(int ar1[],int ar2[],int size1,int size2){
                  for(int i=0;i<size1;i++){
                      for(int j=0;j<size2;j++){
                         if(ar1[i]==ar2[j]){
                            System.out.println(ar1[i]);
                         }
                           }
                              }
                                 }    

    





      static void findUnion(int ar1[],int ar2[],int size1,int size2){
             int ar3[]=new int[size1+size2];
             int k=size1;
             for(int i=0;i<=size1;i++){
                      if(i==k){
                         for(int j=0;j<size2;j++){
                             ar3[k]=ar2[j];
                             k++;
                            }
                     break;
                                 }
                
                     ar3[i]=ar1[i];
                     
                                       }

           for(int element:ar3){
               System.out.println(element);
              }
                                           }


         



                      

                                                       }
