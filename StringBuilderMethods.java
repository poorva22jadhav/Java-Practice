class ReverseInteger {
    public static void main(String[] args) {
          
    
           StringBuilder str=new StringBuilder();
           str.append("Hey this is first program");
           System.out.println(str);

           StringBuilder str2=new StringBuilder(10);
           str2.append("hello Beautiful People");
           System.out.println(str2);

           String str4="Akash Vaani";
           StringBuilder str3=new StringBuilder(str4);
           System.out.println(str4);

           //appendMethod();
           //  insertMethod();
           SBMethods();
         
           
         
    }



   static void appendMethod(){
           StringBuilder sb1=new StringBuilder();
           boolean value=true;
           sb1.append(value);
           System.out.println(sb1);

           StringBuilder sb2=new StringBuilder();
           char ar1[]={'H','E','L','L','O'};
           sb2.append(ar1);
           System.out.println(System.identityHashCode(sb2));
           System.out.println(sb2);
           sb2.append('O');
           sb2.append("Purva");
           System.out.println(System.identityHashCode(sb2));
           System.out.println(sb2);


           String var=new String("poorva");
           var.concat("Jadhav");            //concat() method does not modify the existing string; it returns a new string with the concatenated result.
                                            // Since you are not assigning the result of the concat() method back to var, the original string remains unchanged.
           System.out.println(var);


          StringBuilder sb3=new StringBuilder();
          sb3.append(23);
          sb3.append(32.00);
          
          System.out.println(sb3);
           
         

          
             }



    static void insertMethod(){
           StringBuilder sb=new StringBuilder("Hello,! ");
           sb.insert(8,true);
           sb.insert(6,"poorva");
           sb.insert(0,'X');
           
           System.out.println(sb);


           StringBuilder sb2 = new StringBuilder("Hello!");
           
           sb2.insert(5, "hbabyh", 1, 5); // Inserts "world, " at position 5
           System.out.println(sb2);

         }


   static void SBMethods(){
          StringBuilder sb=new StringBuilder("Hello");
          char a=sb.charAt(4);
          System.out.println(a); //o
          
          StringBuilder sb2=new StringBuilder("poorva");
          sb2.delete(1,3);
          sb2.deleteCharAt(3);
           System.out.println(sb2);


           StringBuilder sb3=new StringBuilder("Rutuja");
           sb3.setCharAt(0,'r');
           System.out.println(sb3); 

           sb3.reverse();
           System.out.println(sb3); 


           StringBuilder sb4=new StringBuilder("Ravi");
           String str=sb4.toString();
           System.out.println(sb4); 
           }

     
}
