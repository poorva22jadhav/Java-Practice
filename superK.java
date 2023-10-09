class Shape{
      protected String color;

      Shape(String color){
            this.color=color;
            System.out.println("color would be "+color);
             }
     static final void ShapeMethod(){
           System.out.println("In Shape final static method");
                }

       void draw(){
            System.out.println("In  shape metthod");
                   }

           }

class Circle extends Shape{
             int radius;
             Circle(String color,int radius){
                    super(color);
                    System.out.println("radius would be "+radius);
                    this.radius=radius;
                    calculateCircum();
                    super.draw();
                }
            
             
             void draw(){
                   System.out.println("In method draw");
                   calculateCircum();
                         }

             

             void calculateCircum(){
                  System.out.println("In method circle");
                   
                                  }
                        }

class Rectangle extends Circle{
                int length;
                int width;
                
                Rectangle(String color,int length,int width,int radius){
                          super(color,radius);
                          this.length=length;
                          this.width=width;
                          
                         }
              
                  void draw(){
                        System.out.println("In rectangle method");
                             }

                   void getArea(){
                        System.out.println(length*width);
                     }
                  }

class Main{
          public static void main(String args[]){
                  //Shape sh=new Shape("Blue");
                   Shape sh2=new Circle("White",13);
                   sh2.draw();
                   //Circle sh1=new Circle("REd",12);
                   //sh1.ShapeMethod();
                   //Rectangle sh2=new Rectangle("Violet",1,2,3);
                   //sh2.getArea();

                   
                 
               }
            }
                    