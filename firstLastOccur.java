import java.util.*;
class firstLastOccur{
      public static void main(String args[]){
             int ar1[]={1, 3, 5, 5, 5, 5, 67, 123, 125};
             int size=ar1.length;
             int x=67;
             firstLastOccur(ar1,size,x);
             firstLastOccur2(ar1,size,x);
             }


     static void firstLastOccur(int ar1[],int size,int x){
            for(int i=0;i<size;i++){
                if(ar1[i]==x){
                  System.out.println("First occurence would be "+i);
                   break;
                    }
             }

            for(int j=size-1;j>=0;j--){
                if(ar1[j]==x){
                   System.out.println("Last occurence would be "+j); 
                   break;
                               }

              }
                   }


   static void firstLastOccur2(int ar1[],int size,int x){
               int firstOccur=0;
               int lastOccur=0;

               for(int i=0;i<size;i++){
                   if(x!=ar1[i]){
                      continue;
                    }
                    
                   if(firstOccur==0){
                      firstOccur=i;
                    }
                    else{
                    lastOccur=i;
                         } 

                   if(lastOccur==0){
                      lastOccur=firstOccur;
                       }
                           }
               System.out.println("First Occurence would be "+firstOccur);
               System.out.println("Last Occurence would be "+lastOccur);
                            }
                                 }
             