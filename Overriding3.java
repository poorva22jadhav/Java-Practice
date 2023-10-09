class core2web{
      void fun(String str){
              System.out.println("string");
                           }

      void fun(StringBuffer str1){
              System.out.println("stringbuffer");
                            }
                               }


class client{
      public static void main(String args[]){
             core2web c1=new core2web();
             c1.fun("Poorva");
             c1.fun(new StringBuffer("core2web"));
           //  c1.fun(null);   // Ambiguous Case:null can match both String and StringBuffer types
             }
                  }