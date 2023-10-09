import java.util.*;

class Platform {
    String str = null;
    int coll = 0;

    Platform(String str, int coll) {
        this.str = str;
        this.coll = coll;
    }

    public String toString() {
        return "{" + str + ":" + coll + "}";
    }
}

class SortByName implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Platform pl1 = (Platform) obj1;
        Platform pl2 = (Platform) obj2;
        return pl1.str.compareTo(pl2.str);
    }
}

class SortByColl implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Platform pl1 = (Platform) obj1;
        Platform pl2 = (Platform) obj2;
        return pl1.coll - pl2.coll;
    }
}

class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap tm = new TreeMap(new SortByName());
        tm.put(new Platform("youtube", 2005), "google");
        tm.put(new Platform("Chat", 2010), "google");
        tm.put(new Platform("Instagram", 2002), "google");

        System.out.println(tm);
    }
}
