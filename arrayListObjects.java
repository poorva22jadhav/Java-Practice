import java.util.*;
class cricPlayer{
      int jersyNo;
      String name;

      cricPlayer(int jersyNo,String name){
                 this.jersyNo=jersyNo;
                 this.name=name;
                 }


      public String toString(){
             return "Name: "+ name + " Jersy No: "+jersyNo;

              }
  }


class ArrayListDemo{
     public static void main(String args[]){
            ArrayList al=new ArrayList();
            
            al.add(10);
            al.add(20);
            al.add(new cricPlayer(19,"Virat Kohali"));
            al.add(new cricPlayer(20,"Rohit Sharma"));
            System.out.println(al);
            
            }
       }