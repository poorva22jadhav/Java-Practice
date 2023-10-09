class countOne{
      public static void main(String args[]){
             int ar1[]={121,3,45,21,61,11,12,22,4,111};
             int size=ar1.length;

              

      int count=0;
      for(int i=0;i<size;i++){
          while(ar1[i]!=0){
               int num=ar1[i]%10;
                   if(num==1){
                     count++;
                    }
           
               ar1[i]=ar1[i]/10;
                  }
                       }

              System.out.println("count of 1 would be "+count);
                           }
                              }