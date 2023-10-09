class mergeTwoIntervals{
      public static void main(String args[]){
             int ar1[][]={{1,3},{3,6}};
             int size=ar1.length;
             mergeOverlapping(ar1,size);
             }

      static void mergeOverlapping(int ar1[][],int size){

            int ar2[][]; 
             
             for(int i=0;i<size-1;i++){
                int k=ar1[i].length;
                int j=ar1[i+1].length;
                
                    if(ar1[i][k-1]>=ar1[i+1][0]){
                      ar1[i][k-1]=ar1[i+1][j-1];

                         for(int l=0;l<j;l++){
                             ar1[i+1][l]=0;
                           }
                     
                     }
                
                       }

             for(int p=0;p<ar1.length;p++){
                  for(int q=0;q<ar1[p].length;q++){
                      if(ar1[p][0]==0&&ar1[p][1]==0){
                         continue;
                        }
                   System.out.println(ar1[p][q]);
               }
            }
                      
          }
       }