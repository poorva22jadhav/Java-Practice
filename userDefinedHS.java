import java.util.*;

class setDemo2{
      
      int jerNo;
      String name;


      setDemo2(int jerNo,String name){
             this.jerNo=jerNo;
             this.name=name;
            
           }

     public String toString(){
            return "name: "+ name +" jerNo: "+ jerNo;
           }

      

  }

class setDemo{
 public static void main(String args[]){
               LinkedHashSet hs=new LinkedHashSet();
             
               hs.add(new setDemo2(18,"Virat"));
               hs.add(new setDemo2(7,"Mahi"));
               hs.add(new setDemo2(77,"Shubhman"));
               hs.add(new setDemo2(77,"Shubhman"));
               System.out.println(hs);
               }

               
               
        
    }