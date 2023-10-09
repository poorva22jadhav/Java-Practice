class stringPalindrome{
      public static void main(String args[]){
          String str="madama";
          System.out.println(palindromeCheck(str));  
          }

      static boolean palindromeCheck(String str){
             int left=0;
             int right=str.length()-1;

             while(left<right){
                  if(str.charAt(left)!=str.charAt(right)){
                     return false;
                   }
                 
                  left++;
                  right--;

                  }
            return true;
          }
        
      }
               
       