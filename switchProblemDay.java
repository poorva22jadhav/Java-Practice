import java.io.*;
import java.util.*;


class switchExample{
      public static void main(String args[])throws IOException{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the day");
             int date=Integer.parseInt(br.readLine());
             

             System.out.println(day(date));
             
             }


      static String day(int date){
             if(date<=30){
                int rem=date%7;
                String day="";

                switch(rem){
                      case 1:
                             day="Monday";
                             break;

                      case 2:
                             day="Tuesday";
                             break;

                      case 3:
                             day="Wednesday";
                             break;


                      case 4:
                             day="Thursday";
                             break;

                      case 5:
                            day="friday";
                            break;

                    
                     case 6:
                            day="saturday";
                            break;

                     case 0:
                           day="Sunday";
                           break;

                    default:
                           day="Invalid";
                           break;
                   }

                   return day;
                        }
                     else{
                          return "Invalid";
                         }
                   
               
                                   }
                                       }
                    


 
      