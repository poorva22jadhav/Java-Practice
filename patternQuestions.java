import java.util.*;
class patternQuestions{
      public static void main(String args[]){
             pattern1();
             pattern2();
             pattern5();
             pattern3();
             pattern4();
             pattern6();
             pattern7();
             pattern8();
             pattern9();
             pattern10();
             pattern11();
             pattern12();
             pattern13();
             pattern14();
            }

 static void pattern14(){
        int num=0;
        int num1=3;

         Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();
          
        for(int i=1;i<=rows;i++){
            int temp=i;
            for(int j=1;j<=num+i;j++){
                if(j%2==0){
                  System.out.print("*");
                 }
                if(i%2==0){
                   System.out.print(num1);
                }

                if(i%2==1){
                  System.out.print(temp);
                  temp++;
               }
            }

           num1=num1+7;
           System.out.println();
           num++;                      
         }
      }





  static void pattern13(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();

            int temp=0;
            for(int i=1;i<=rows;i++){

                for(int j=1;j<=rows-i;j++){
                   System.out.print("  ");
                  }
                for(int k=1;k<=temp+i;k++){
                    System.out.print("* ");
                   }

               
           
               System.out.println();
               temp++;
             }
    }






   


  static void pattern12(){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();



           for(int i=1;i<=rows;i++){
              
               for(int j=1;j<=rows-i;j++){
                  System.out.print("  ");
                }
           
               for(int k=1;k<=i;k++){
                   if(k==1||k==i){
                   System.out.print("* ");
                   }
                   else{
                     System.out.print("  ");
                   }
               }
                System.out.println();
            }

         for(int p=1;p<=rows-1;p++){
             for(int q=1;q<=p;q++){
                 System.out.print("  ");
                }

             for(int r=1;r<=rows-p;r++){
                if(r==1||r==rows-p){
                  System.out.print("* ");
                 }
 
                else{
                     System.out.print(" ");
                   }
             System.out.println();
            }
       }  }












static void pattern11(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();

        int num=0;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<=rows-i;k++){
              System.out.print("  ");
              }

            for(int l=1;l<=num+i;l++){
                System.out.print("* ");
              }
            System.out.println();
            num++;

           }


         for(int m=1;m<=rows-1;m++){
             for(int n=1;n<=m;n++){
                 System.out.print("  ");
              }

              for(int p=1;p<=(2*rows-2*m+1)-2;p++){
                  System.out.print("* ");
                  }
         System.out.println();
         }
     }









static void pattern10(){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();
             int num=0;
             for(int i=1;i<=rows;i++){
               

                 for(int j=1;j<=2*rows-2*i;j++){
                    System.out.print("  ");
                  }

                 for(int k=1;k<=num+i;k++){
                     System.out.print("* ");
                   }
             
                   System.out.println();
                   num++;
 
              }
               num++;

               for(int m=1;m<=rows-1;m++){
                   
                   for(int l=1;l<=2*m;l++){
                       System.out.print("  ");
                       }

                    for(int n=1;n<=num-m;n++){
                        System.out.print("* ");
                     }
                     System.out.println();
                     num--;
            }
        }








static void pattern9(){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();


        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
                }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
                 }

            System.out.println();
       
         }

          for(int m=1;m<=rows-1;m++){
             for(int l=1;l<=m;l++){
                 System.out.print("  ");
                      }

             for(int n=1;n<=rows-m;n++){
                 System.out.print("* ");
                }
           System.out.println();
         }
   }








 static void pattern8(){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();



        for(int i=1;i<=rows;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
             
            System.out.println();
        }

        for(int k=1;k<=rows-1;k++){
            for(int l=0;l<rows-k;l++){
                System.out.print("* ");
               }
            System.out.println();
         }

     }











static void pattern7(){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();


        for(int i=1;i<=rows;i++){
           for(int j=1;j<i;j++){
              System.out.print("  ");
            }

            for(int k=1;k<=2*(rows-i)+1;k++){
                System.out.print("* ");
             }

            for(int l=1;l<i;l++){
              System.out.print("  ");
            }
      
            System.out.println();
      }
 }




static void pattern6(){

              char ch='d';
              char ch1='C';

         Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();
        int num=1;
        for(int i=1;i<=rows;i++){
             
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
               }
            for(int k=1;k<=2*i-1;k++){
                if(i%2==1){
                   System.out.print(ch+" ");
                  
                }

                else{
                     System.out.print(ch1+" ");
                            
                   }
               }

           for(int l=1;l<=rows-i;l++){
                System.out.print("  ");
            
                   } 
          System.out.println();
          num--;
          }
          

    }





 static void pattern5(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();
            int num=1;
            int num2=1;
            int num3=1;
            
           for(int i=1;i<=rows;i++){
               num=num2;
               for(int j=0;j<i-1;j++){
                  System.out.print("  ");
                  }

               for(int k=0;k<=rows-i;k++){
                   if(i%2==1){
                      System.out.print(num+" ");  
                      num+=2;
                          if(k==0){
                             num2=num;
                                   }
                          if(k==rows-i-1){
                            num3=num;
                                      }   
                       }
                     
                     else{
                          System.out.print(num3+" ") ;
                          num3--;
                          num3--;
                         
                      }  
                    }  
                       
              System.out.println();
              
           }

              }




    static void pattern4(){

          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no of rows");
          int rows=sc.nextInt();

       
           
           for (int i = 1; i <= rows; i++) {
                  int num=1;
                  char ch='b';

                 for (int j = 1; j <= rows - i; j++) 
                 {
                 System.out.print("  ");
                 }
                
                for (int k = 1; k <= i; k++) {
                     if(k%2==1){
                        System.out.print(num+" ");
                        num++;
                        }
                    
                     else{
                         System.out.print(ch+" ");
                         ch++;
                         ch++;
                          
                          }
                     
                }
                   
                   
                 System.out.println();
                }
          
         
             }
              

           









      static void pattern1(){
           
             int temp=1;
             char character='a';
             for(int i=0;i<4;i++){
                   int num=temp;
                  for(int j=0;j<4;j++){
                     System.out.print(num+" ");
                     num+=3;
                         if(j==1){
                         temp=num;
                      }
                   }
               System.out.println();
                          }
           
             
                              }
     
       static void pattern2(){
              
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no of rows");
          int rows=sc.nextInt();


               int num=1;
               int mult=1;
              for(int i=1;i<=rows;i++){
                      
                  for(int j=1;j<=i;j++){                         
                      if(i==1){
                        System.out.print(num+" ");
                        num++;
                         }

                      else if(i==2){
                         System.out.print(num*num+" ");
                         num++;
                            }

                      else if(i==3){
                           System.out.print(num*num*num+" ");
                           num++;
                          }

                       else{
                           System.out.print(num*num*num*num+" ");
                           num++;
                          } 
                         
                  
                    
                     
                     }
                  
                  
                  System.out.println();
                          }
                               }


     static void pattern3(){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int rows=sc.nextInt();
            
            char char1='d';
            char char2='C';
            
            for(int i=0;i<rows;i++){
                
                for(int j=1;j<rows-i+1;j++){
                   if(i%2==0){
                    System.out.print(char1+" ");
                      
                   }

                  else{
                    System.out.print(char2+" ");
                    
                    
                   }
                     }
           System.out.println();
             }
                }


       
                   }


 


                
                                             
             