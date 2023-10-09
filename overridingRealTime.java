class Match{
      void Match(){
           System.out.println("Test/T20/OneDay");
                  }
                       }


class IPL extends Match{
         void Match(){
              System.out.println("T20");
                      }

         void Sum(int a,int b){
                  int c= a+b;
                  System.out.println(c);
                     }
                         }

class Test extends Match{
      void Match(){
           System.out.println("Test");
                   }

      int Sum(int a,int b,int c){
                  int d= a+b+c;
                  return d;
                     }
                       }


class client{
      public static void main (String args[]){
     
      Match match1=new Match();
      Match match2=new IPL();
      Match match3=new Test();


      match1.Match();
      match2.Match();
      match3.Match();
      //match2.Sum(1,2);

                        }
                              }
      