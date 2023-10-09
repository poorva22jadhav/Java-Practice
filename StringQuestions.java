
import java.util.*;

class reverseString{
     

     public static void main(String args[]){
             
                  String name="hey poorva whatsup how u doing";
                  String name2="madam madam";
                  //reverse(name);
                  //System.out.println(palindrome(name2));
                  //charArray();
                  //searchString();
                  //findDuplicates();
                  System.out.println(rotateString());

                  
                  }

    static boolean rotateString(){
           System.out.println("Enter second string");
           Scanner sc=new Scanner(System.in);
           String str2=sc.nextLine();


           String str="riya";
           
         

           int length = str.length();

    
        for (int position = 0; position < length; position++) {
        String rotatedString = str.substring(position) + str.substring(0, position);
        if (str2.equals(rotatedString)) {
            return true;
        }
    }

    return false;
          
          }
           
    





   



  static void findDuplicates(){
        
             String str="MadaM";
             char ar1[]=str.toCharArray();
             

             for(int i=0;i<ar1.length;i++){

                for(int j=i+1;j<ar1.length;j++){
                    if(ar1[i]==ar1[j]){
                       System.out.println("Duplicate character would be "+ar1[i]);
                     }
               }

           }

        }







 static void searchString(){
          String str1="Swara,Shivani,Purva,Rutuja";
          String array[]=str1.split(",");
          int length=array.length;
          System.out.println("Enter your target");
          Scanner sc=new Scanner(System.in);
          String target=sc.nextLine();
          

          for(int i=0;i<array.length;i++){
              if(array[i].equals(target)){
                System.out.println("Target found at "+i);
                                   }
                                     }
                 }



static void charArray(){
         String str="Riya ";
         char ar1[]=str.toCharArray();
               for (int i=0;i<ar1.length-1;i++){
                   System.out.println(ar1[i]);
                      }
                          }


 static void reverse (String name){

           int length=name.length();
           System.out.println(length);
           
           String reversed="";
          for(int i=length-1;i>=0;i--){
             reversed=reversed+name.charAt(i);
               }

         System.out.println(reversed);

          }



   static boolean palindrome(String name){
          int start=0;
          int end=name.length()-1;

          while(start!=end){
               if(name.charAt(start)!=name.charAt(end)){
                return false;
              }

             start++;
             end--;
          }
       return true;
    }
           
 }