class StrDemo{
      public static void main(String args[]){
               
               
              //immutable();
               // NoRefer();
              addition();
        
            }

            static void memory(){
                    String str = "Hello";
               String str2="Hello";
               
               String str4=new String("Hello");
               

               System.out.println(str==str4);  //false
               System.out.println(str==str2); //true

               System.out.println(str.equals(str2));  //true
               System.out.println(str.equals(str4));  //true

              System.out.println(System.identityHashCode(str));  //same
              System.out.println(System.identityHashCode(str2)); //same
              System.out.println(System.identityHashCode(str4)); //different
                }

            static void immutable(){
               /*
                   String str5="poorva";
                   String str6="jadhav";
                   
                  String str7="poorvajadhav";
                  String str8=str5+str6;
              
               

                 System.out.println(System.identityHashCode(str7));  //different hashcode
                 System.out.println(System.identityHashCode(str8));  //different
              */  

                 String str="poorva";
                 
                 //str="poo";

                 
                  System.out.println(System.identityHashCode(str)); 
                  
                   
             

                
          }


         static void NoRefer(){
            /*           String pr="poovra";
                System.out.println(System.identityHashCode(pr));
                
                pr=pr.concat("jadhav");
                System.out.println(pr);
                System.out.println(System.identityHashCode(pr));
           */

                String name="shashi";
                String surname="bagal";
                
                System.out.println(name);
                System.out.println(surname);
                System.out.println(System.identityHashCode(name));
                System.out.println(System.identityHashCode(surname));
               
                name=name.concat(surname);
                //name.concat(surname);
                 
                  System.out.println(name);
                System.out.println(surname);
                  System.out.println(System.identityHashCode(name));
                  System.out.println(System.identityHashCode(surname));
               

            }

           static void addition(){
                   
                  String str1="Riya";
                  String str2="Somani";
                  System.out.println(System.identityHashCode(str1));

                  str1=str1+str2;
          
                   //str1=str1.concat(str2);

                  System.out.println(str1);
                  System.out.println(System.identityHashCode(str1));


                 
                  
      } 
   }  