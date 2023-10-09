interface A{
          int x=10; //this A will be stored in Stack frame
          }

interface B{
           int x=20;
            }

class child implements A,B{
       int x=30;

       void fun(){
               System.out.println(x);           // if we wont write A.x and B.x and int x=30 there will be an ambiguous case 
               System.out.println(A.x);         
               System.out.println(B.x);
                  }

                        }

class client{
      public static void main(String args[]){
             child obj=new child();
             obj.fun();
                         }
                             }
                