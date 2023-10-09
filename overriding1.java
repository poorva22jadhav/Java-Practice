class parent{
 
      parent(){

            System.out.println("In parent constructor");
                }

      void fun(){
           System.out.println("in parents fun method");
                 }

      }

class child extends parent{
      child(){

            System.out.println("In child constructor");
                }



       void fun(){
           System.out.println("in child fun method");
                 }

}

class client{
      public static void main(String args[]){
            parent obj= new child();
            obj.fun();
       }
}