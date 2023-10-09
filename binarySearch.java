class binarySearch{
      public static void main(String args[]){
             int ar1[]={3,5,6,7,8,9,10};
             int ar2[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
             
             int target=9;
             System.out.println(binarySearch(ar1,target,0,ar1.length-1));
             }


      static int binarySearch(int ar1[],int target,int start,int end){
             


             while(start<end){
             
             int mid=start+(end-start)/2;
              
             if(ar1[mid]==target){
               return mid;
              }

             if(target>ar1[mid]){
                return binarySearch(ar1,target,mid+1,end);
                 }
 
             else{
                 return  binarySearch(ar1,target,start,mid-1);
                 }
             }

            return -1;
       }

      static int  pivotBinarySearch(int ar2[],int target,int start,int end){
               
          }


             