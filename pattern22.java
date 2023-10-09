class pattern{
       
     public static void main(String args[]){
      int N=6 ;
      int num=1;
      int num2=2;

      for(int i=1;i<=N;i++){
          for(int j=1;j<=N+1;j++){
              
              if(i%2==1){
                 System.out.print(num);

                 if(j==N+1){
                    System.out.print(num2);
            
                    num++;
                    num2++;
                      }
                   }

             else if(i%2==0){
                  if(j==1){
                    System.out.print(num2);
                  }

                 System.out.print(num);

                 if(j==N+1){
                   num++;
                   num2++;
                 }
                
             }
          }

          System.out.println();
       }
 }   }



  
          
            