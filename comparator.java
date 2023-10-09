import java.util.*;

class Movies {
    String name = null;
    double coll = 0.0;
    float imdb = 0.0f;

    Movies(String name, float imdb, double coll) {
        this.name = name;
        this.coll = coll;
        this.imdb = imdb;
    }

    public String toString() {
        return "{" + name + ":" + coll + ":" + imdb + "}";
    }
}

class SortByName implements Comparator {
    public int compare(Object obj1, Object obj2) {
        return ((Movies) obj1).name.compareTo(((Movies) obj2).name);
    }
}

class SortByColl implements Comparator {
    public int compare(Object obj1, Object obj2) {
        return (int) (((Movies) obj1).coll - ((Movies) obj2).coll);
   
    }
}

class SortByImdb implements Comparator {
    public int compare(Object obj1, Object obj2) {
        return (int) (((Movies) obj1).imdb - ((Movies) obj2).imdb);
    }
}

 class UserList {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add(new Movies("Bulbul", 9.8f, 400));
        al.add(new Movies("Sairat", 9.7f, 230));
        al.add(new Movies("Masaan", 9.8f, 430));

        Collections.sort(al, new SortByName());
        System.out.println("Sorted by Name: " + al);

        Collections.sort(al, new SortByColl());
        System.out.println("Sorted by Collection: " + al);

        Collections.sort(al, new SortByImdb());
        System.out.println("Sorted by IMDb: " + al);
    }
}
