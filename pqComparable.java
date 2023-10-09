import java.util.*;

/*
class Project implements Comparable{
      String projectName;
      int teamSize;
      float duration;

      Project(String projectName,int teamSize,float duration){
             this.projectName=projectName;
             this.teamSize=teamSize;
             this.duration=duration;
             }

      public String toString(){
             return "{"+projectName+":"+teamSize+":"+duration+"}";
             }

     public int compareTo(Object obj){
            Project pr=(Project)obj;
            return projectName.compareTo(pr.projectName);
            }
        }

class priorityDemo{
      public static void main(String args[]){
             PriorityQueue pr=new PriorityQueue();
             pr.offer(new Project("Web Development",12,4));
             pr.offer(new Project("Machine Learning",4,4));
             pr.offer(new Project("Artificial Intelligence",10,2));

            System.out.println(pr);

            }
        }

*/

class Project{
      String projectName;
      int teamSize;
      float duration;

      Project(String projectName,int teamSize,float duration){
             this.projectName=projectName;
             this.teamSize=teamSize;
             this.duration=duration;
             }

      public String toString(){
             return "{"+projectName+":"+teamSize+":"+duration+"}";
             }
         }


 class sortByName implements Comparator{
       public int compare(Object obj1,Object obj2){
              Project pr=(Project)obj1;
              Project pr2=(Project)obj2;

              return pr.projectName.compareTo(pr2.projectName);
              }
          }

 class sortByDuration implements Comparator{
       public int compare(Object obj1,Object obj2){
              Project pr=(Project)obj1;
              Project pr2=(Project)obj2;

              return (int)(pr.duration-pr2.duration);
              }
          }

class prComparator{
      public static void main(String args[]){
             PriorityQueue pr=new PriorityQueue(new sortByDuration());
             pr.offer(new Project("Web Development",12,6));
             pr.offer(new Project("Machine Learning",4,4));
             pr.offer(new Project("Artificial Intelligence",10,2));

            System.out.println(pr);
                }
          }
             
   
 