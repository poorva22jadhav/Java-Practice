import java.util.LinkedList;

 class LinkedListTraversalExample{
       public static void main(String args[]){
              LinkedList<Integer> LL1=new LinkedList<>();
              LinkedList<Integer> LL2=new LinkedList<>();
            
              LL1.add(10);
              LL1.add(20);
              LL1.add(30);
 
              LL2.add(20);
              LL2.add(30);
              LL2.add(40);


              for(int i=0;i<LL1.size();i++){
                  for(int j=0;j<LL2.size();j++){
                      if(LL1.get(i)==LL2.get(j)){
                         System.out.println(LL1.get(i));
                      }
               }   }

              
          }
      }