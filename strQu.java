class StrQue{
      public static void main(String args[]){
             String str="Aradhya and Akanksha";
             String str2="rutuja";
             String str4="madam";
             String str3="Java Program";
             String str5="core2web technologies";
             String str6="good morning coders";

             //System.out.println(reverseString(str2));
             //System.out.println(replaceStr(str));
             //System.out.println(palindrome(str4));
             //System.out.println(removeStr(str3));
             //countFreq(str5);
             System.out.println(Capitalize(str6));
             }
 
      static String replaceStr(String str){
             char ar1[]=str.toCharArray();
                  for(int i=0;i<ar1.length;i++){
                     if(ar1[i]==' '){
                        ar1[i]='-';
                        }
                    if(ar1[i]=='a'){
                       ar1[i]='@';
                       }
                      }

            String str1=new String(ar1);

             return str1;
             }

       static String reverseString(String str){
              
              String str3=new String();
          
          for(int i=str.length()-1;i>=0;i--){
                str3=str3+str.charAt(i);
              }
           return str3;

        }

      static boolean palindrome(String str){
             int first=0;
             int last=str.length()-1;
             boolean flag=true;
             while(first<=last){
                   if(str.charAt(first)!=str.charAt(last)){
                    
                     flag=false;
                    }
                    first++;
                    last--;
                 }
             
                 return flag;
                 
               }


     static String removeStr(String str){
            String str3="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='a'){
                   continue;
                   }
                 str3=str3+str.charAt(i);
              }
             
             return str3;
         }


    static void countFreq(String str){
          
            char ar1[]=str.toCharArray();
           
            for(int i=0;i<ar1.length;i++){
                   int count=0;
                   
                for(int j=0;j<ar1.length;j++){
                    if(ar1[i]==ar1[j]){
                       count++;
                       }
                    }

               
            System.out.println(ar1[i]+" :"+count);
               }
           }

    static String Capitalize(String str){
          /* String ar1[]=str.split(" ");
           
           for(int i=0;i<ar1.length;i++){
              ar1[i] =  ar1[i].charAt(0).toUpperCase()+ar1[i].substring(1);
                 }

          String str2=String.join(" ",ar1);
              
          
          return str2;   

        */

         str=str.toUpperCase();
         return str;

        }
   }
