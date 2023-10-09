import java.util.Arrays;

    class ArrayQ{
       public static void main (String args[]){
              

              int twoD[][]={{1,3},{7,10},{2,6},{2,4},{10,12 }};
              //System.out.println(Arrays.deepToString(twoD));
              Arrays.sort(twoD,(a,b)->Integer.compare(a[0],b[0]));
              //System.out.println(Arrays.deepToString(twoD));
              int ar1[][]=OverlappingArray(twoD);
              //System.out.println(Arrays.deepToString(ar1));

              int arr1[]={1,3,5,7};
              int arr2[]={0,2,6,8,9};
              int m=arr1.length;
              int n=arr2.length;
              mergeTwoSortedArray(arr1,arr2,m,n);   
              } 

      static int[][] OverlappingArray(int ar2[][]){
             int index=0;
             for(int i=1;i<ar2.length;i++){
                 if(ar2[index][1]>=ar2[i][0]){
                   ar2[index][1]=Math.max(ar2[index][1],ar2[i][1]);
                     }

                 else{
                      index++;
                      ar2[index]=ar2[i];
                    }
                 }

               int ans[][]=Arrays.copyOf(ar2,index+1);
               return ans;
        }

     static void mergeTwoSortedArray(int ar1[],int ar2[],int m,int n){
                 int ar3[]=new int[m+n];
                 int left=0;
                 int right=0;
                 int index=0;
                 int k=m+n;

                 while(left!=m && right!=n){
                       if(ar1[left]>ar2[right]){
                          ar3[index]=ar2[right];
                          right++;
                          index++;
                         }
                       
                        else{
                             ar3[index]=ar1[left];
                             left++;
                             index++;
                           }
                    }

                  
                       while(left!=m){
                        ar3[index]=ar1[left];
                        index++;
                        left++;
                      }

                        while (right!=n){
                        ar3[index]=ar2[right];
                        index++;
                        right++;
                      }
                   

                 

                  
                    for(int j=0;j<ar1.length;j++){
                        ar1[j]=ar3[j];
                       }
                    int temp=0; 
                    for(int i=m;i<k;i++){
                        ar2[0]=ar3[m];
                        temp++;
                        }

                    for(int element:ar3){
                     System.out.print(element+" ");
                              }
                   System.out.println();

                    for(int element:ar1){
                     System.out.print(element+" ");
                              }
                   System.out.println();

                     for(int element:ar2){
                     System.out.print(element+" ");
                              }
                
                }
                 
      }        