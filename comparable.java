/*import java.util.*;

class Movies implements Comparable{
             String MovieName=null;
             float Totcoll=0.0f;

             Movies(String movieName,float Totcoll){
                    this.MovieName=movieName;
                    this.Totcoll=Totcoll;
                  
                    }

             public int compareTo(Object obj) {
                    return this.MovieName.compareTo(((Movies)obj).MovieName);
    }


             public String toString(){
                    return MovieName;
                }
           }

class TreeDemo{
      public static void main(String args[]){
             TreeSet ts=new TreeSet();
             ts.add(new Movies("swades",234.98f));
             ts.add(new Movies("MNIK",294.98f));
             ts.add(new Movies("GWH",414.98f));

             System.out.println(ts);
            }
       }
*/
import java.util.*;

class Movies implements Comparable<Movies> {
    String MovieName = null;
    float Totcoll = 0.0f;

    Movies(String movieName, float Totcoll) {
        this.MovieName = movieName;
        this.Totcoll = Totcoll;
    }

    public int compareTo(Movies otherMovie) {
        return Float.compare(this.Totcoll, otherMovie.Totcoll);
    }

    public String toString() {
        return Float.toString(Totcoll); // Convert Totcoll to a string
    }
}

 class TreeDemo {
    public static void main(String args[]) {
        TreeSet<Movies> ts = new TreeSet<>();
        ts.add(new Movies("swades", 234.98f));
        ts.add(new Movies("MNIK", 294.98f));
        ts.add(new Movies("GWH", 414.98f));

        for (Movies movie : ts) {
            System.out.println(movie);
        }
    }
}

             
