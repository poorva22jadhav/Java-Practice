class problem12{
      public static void main(String args[]){
             String str="rotation";
             String rotated="rotation";
             
              boolean result=checkRoatation(str,rotated);
              //System.out.println(result);



             String str1="XY";
             String str2="12";
             String str3="2X1Y";

             boolean result1=validShuffle(str1,str2,str3);
             System.out.println(result1);
                   }
             
   static  boolean  checkRoatation(String str,String str1){
             if(str1.length()!=str.length()){
                return false;
               }
            
             for(int i=0;i<str.length();i++){
               String  str3=str.substring(i+1,str.length())+str.substring(0,i+1);
               if(str3.equals(str1)){
                  return true;
                    }
                      
                       }

               return false;

             }



            
    }    

