
import java.util.*;

class simpleSwitch{
      public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              int num=sc.nextInt();

             
             System.out.println(number(num));

             }

     static String number(int num){
            if(num>=1 && num<=10){
              String str="";
              switch(num){
                case 1:
                     str="one";
                     break;

                case 2:
                     str="two";
                     break;

                case 3:
                     str="three";
                     break;

                case 4:
                     str="four";
                     break;

                  
               default:
                    str="invalid";
                    break;
                   }
             
               return str;
                      }

             else{
                 return"Invalid";
                 }
                    }
                           }
               