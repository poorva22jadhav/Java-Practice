import java.io.*;
import java.util.*;


class countOccurence{
      public static void main(String args[])throws IOException{
             int ar1[]={1,2,2,2,3,4,4,4,5};
             int ar2[]={98,97,6,6,6,6,5,5,4,4,4,4,2};
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             int size=ar1.length;
             System.out.println("Enter number");
             int num=Integer.parseInt(br.readLine());
             OccurenceLinearSearch(ar1,size,num);
             System.out.println("Enter number");
             int num2=Integer.parseInt(br.readLine());
             OccurenceBinarySearch(ar2,num2,size);
             }



       static void OccurenceLinearSearch(int ar1[],int size,int num){
             int count=0;
             for(int i=0;i<size;i++){
                if(ar1[i]==num){
                   count++; 
                 }
                    }
             System.out.println("given number exists "+count+ " times");


                           }


      static void OccurenceBinarySearch(int ar1[], int num,int size){

                  int start=0;
                  int end=size-1;

                  int mid=start+(end-start)/2;
                  int count=0;

                  if(ar1[start]<ar1[end]){
                         if(num>ar1[mid]){
                            start=mid+1;
                            }
                         else if(num<ar1[mid]){
                             end=mid-1;
                              }

                        for(int i=start;i<=end;i++){
                           if(ar1[i]==num){
                                 count++;
                               }
                                    }


                             }

                  else{
                      if(num>ar1[mid]){
                            end=mid-1;
                            }
                      else if(num<ar1[mid]){
                             start=mid+1;
                              }
                       for(int i=start;i<=end;i++){
                           if(ar1[i]==num){
                                 count++;
                               }
                                      }

                       
                                     }

                  System.out.println("Given number "+num+" occured " +count+" times");



                                               }
                                    }
             