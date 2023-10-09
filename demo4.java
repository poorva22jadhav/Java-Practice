/*class Myclass{
     int a;
     int b;

     Myclass(){
		
         System.out.println(this);
     }   





      static void staticMethod1(){
             //System.out.println("In static method 1");
             //staticMethod2();
           }

      static void staticMethod2(){
            
             //System.out.println("In static method 2");
              //will give error non-static method cannot be referenced from static contex
           }

       void instanceMethod(){
             //System.out.println("hii");
             System.out.println(this);
             
         }
     }

class Main{
      public static void main(String args[]){
             Myclass obj=new Myclass();
             Myclass obj1=new Myclass();
             //obj.staticMethod1();
             
             obj.instanceMethod();
             obj1.instanceMethod();
        }
    }
*/


class Box{
	int length;
	int width
	Box(int length,int width){
		this.length=length;
		this.width=width;
	}

	Box(int height){
		this(1,3);
		
		this.height=height;

	}

	public static void main(String[] args){
		
	}
}