import java.util.*;

class reverseString{
      public static void main(String args[]){
              String str="I like going out alone";
              char[] charArray=str.toCharArray();
              int left=0;
              int right=charArray.length-1;
              System.out.println(charArray.length-1);


              //System.out.println(charArray[left]);
              //System.out.println(charArray[right]);

              
 

              while(left<right){
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
               right--;
               left++;
                 }

               String reversestring=new String(charArray);
               System.out.print(reversestring);

            }


                    }

              
                