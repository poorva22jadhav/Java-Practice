import java.util.*;

class setDemo{
      public static void main(String args[]){
            
             //hashSetFunc();
             LinkedHashDemo();
             }


      static void hashSetFunc(){

             HashSet hs=new HashSet();
             hs.add("Poorva");
             hs.add("Riya");
             hs.add("Akanksha");
             hs.add("Bebo");
             
             System.out.println(hs);



              HashSet hs1=new HashSet(); 
              hs1.add("Somani");
              hs1.add("Riya");
              hs1.add("Aliya");



              HashSet hs2=new HashSet(); 
              hs2.add(10);
              hs2.add(20);
              hs2.add(30);
              
              
           
           /*
              Object ar1[]=hs1.toArray();
              for(Object temp:ar1)  {
                  System.out.println(temp);
                 }
           */

             String array[]=new String[hs1.size()];
             hs1.toArray(array);

             for(String str:array){
                 System.out.println(str);
                }


           Integer array2[]=new Integer[hs2.size()];
           hs2.toArray(array2);

           for(Integer elem:array2){
               System.out.println(elem);
             }



    }



         static void LinkedHashDemo(){
                LinkedHashSet hs3=new LinkedHashSet();
                hs3.add(10);
                hs3.add(20);
                hs3.add(40);

                System.out.println(hs3);
          }
    }