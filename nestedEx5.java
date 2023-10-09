import java.io.*;

class problem18{

        public static void main(String args[]){

                 int a1=0;  int a2=1;  int a3;

                  for(int i=1;i<=4;i++){
                                
                        for(int j=1;j<=i;j++){

                                 if(i==1){
                                      System.out.print(a1 +" ");
                                            }

                               
                                else if(i==2 && j==1){
                                       System.out.print(a2 +" ");
                                     }
                                         
                                else{

                                  a3=a1+a2;

                                  System.out.print(a3+" ");
  
                                     a1=a2;  
                                     a2=a3;
                                     }
                                
                                              } 
                                  System.out.println();
                                  }
                                        }}