import java.util.*;

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

     public int compareTo(Object obj){
            Project pr=(Project)obj;
            return projectName.compareTo(pr.projectName);
            }
        }

class priorityDemo{
      public static void main(String args[]){
             PriorityQueue pr=new PriorityQueue();
             pr.offer(new Project("web Development",12,4));
             pr.offer(new Project("Machine Learning",4,4));
             pr.offer(new Project("Artificial Intelligence",10,2));

            System.out.println(pr);

            }
        }
 