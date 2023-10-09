class stringDemo{
      public static void main(String args[]){
             //BasicMethods();
               ReplaceMethod();

           }
          
          static void BasicMethods(){  
             char ar1[]={'a','b','c'};
             String str=new String(ar1);
             System.out.println(str);

             StringBuffer str1=new StringBuffer("Poorva");
             
             String str2=new String(str1);
             String str3="Jadhav";
            
             System.out.println(str2.length());
             System.out.println(str3.isEmpty()); 
             System.out.println(str2.charAt(2));
             System.out.println(str2.equals("Poorva")); 
             System.out.println(str2.equalsIgnoreCase("poorva"));
             System.out.println(str2.compareTo("poorva"));
             System.out.println(str2.startsWith("P"));
             System.out.println(str2.startsWith("o",2));
             System.out.println(str2.endsWith("a"));
             System.out.println(str2.indexOf("a"));
             System.out.println(str2.indexOf("o",2));
             System.out.println(str2.lastIndexOf("o"));
             System.out.println(str2.substring(5)); 
             System.out.println(str2.substring(1,5)); 
             System.out.println(str2.substring(1,5));
             System.out.println(str2.concat(str3));
             }


      static void ReplaceMethod(){
                  
                  String str="Hello People";
                  str=str.replace("People","BeautifulPeople");
                  System.out.println(str);

                  String str2="Whatsapp is necessary";
                  str2=str2.replace('s','p');
                  System.out.println(str2);


                  String str4="Hey people,What is down";
                  str4=str4.replace('e','@');
                  str4=str4.replace(' ','-');
                  str4=str4.replace('a','$');
                  System.out.println(str4);

                  String str3="apple,banana,orange,berries";
                  str3=str3.replace("banana","ashleel");
                  System.out.println(str3);
              
                  
          }
        }