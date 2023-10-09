  class ReverseInteger {
    public static void main(String[] args) {
           SBMethods();
  
         
           
         
    }



   static void SBMethods(){

         Integer num1=23;

          
         Integer num=Integer.valueOf(42);
         System.out.println(num);    //42

         int extractedVal=num1;
         System.out.println(extractedVal);

         int a=Integer.decode("1234532");
         System.out.println(a);   

         double douVal=num1.doubleValue();
         System.out.println(douVal);    //23.0

         float floatVal=num1.floatValue();
         System.out.println(floatVal);  //23.0

         

         int val=num1.intValue();
         System.out.println(val);  //23

         int max=Integer.max(3,5);
         System.out.println(max);   //5

         int min=Integer.min(1,2);
         System.out.println(min);   //1

         int var=Integer.parseInt("214");
         System.out.println(var);   //214

         String str=Integer.toBinaryString(5);
         System.out.println(str);    //101

         String hexStr=Integer.toHexString(32);
         System.out.println(hexStr); //20

         String str2=num1.toString();
         System.out.println(str2);   //"23"

         String str3=Integer.toString(3214);
         System.out.println(str3);    //"3214"


         Integer var3=Integer.valueOf(21);
         System.out.println(var3);   //21 of type Integer

          Integer var4=Integer.valueOf("23");
         System.out.println(var4);   //23 of type Integer

          
             }



     
}
