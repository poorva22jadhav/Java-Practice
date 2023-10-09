class Outer{
      class Inner{
            void m1(){
                 System.out.println("In m1 method");
                      }
                         }
            void m2(){
                 System.out.println("In m2-Outer");
                      }
                            }

class client{
      public static void main(String args[]){
              Outer.Inner obj=new Outer().new Inner();
              obj.m1();
                        }

                            }

