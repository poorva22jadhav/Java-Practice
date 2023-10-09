class SB{
      public static void main(String args[]){
             StringBuffer str=new StringBuffer("Akanksha");
             String str2="Raje";
             System.out.println(str);
             System.out.println(System.identityHashCode(str));  //same

             
             
             str=str.append("varma");
             System.out.println(System.identityHashCode(str)); //same
            
             str=str.append("Sharma");
             System.out.println(str);
             System.out.println(System.identityHashCode(str));  //same
         }
    }