class Myclass{
      int x;
      int y;

      Myclass(int x,int y){
             this.x=x;
             this.y=y;
           }

     Myclass(int x){
            this(x,0);
            System.out.println(this);
          }

     Myclass(){
            this(0);
            
          }

     void printValues(){
          System.out.println("x: "+x+"y: "+y);
          
         }
     }

class Main{
      public static void main(String args[]){
             Myclass obj1=new Myclass(10,3);
             System.out.println(obj1);
             obj1.printValues();

             Myclass obj2=new Myclass(5);
             System.out.println(obj2);
             obj2.printValues();

             Myclass obj3=new Myclass();
             System.out.println(obj3);
             obj3.printValues();
             
             
             

          }
    }
