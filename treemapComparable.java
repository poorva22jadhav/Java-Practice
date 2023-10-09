import java.util.*;

class Platform implements Comparable {
    String str;
    int foundYear = 0;

    Platform(String str, int foundYear) {
        this.str = str;
        this.foundYear = foundYear;
    }

    public String toString() {
        return "{" + str + ":" + foundYear + "}";
    }

    public int compareTo(Object obj) {
        Platform pl = (Platform) obj;
        return str.compareTo(pl.str);
    }
}

class TreemapDemo {
    public static void main(String args[]) {
        TreeMap tm = new TreeMap();
        tm.put(new Platform("Youtube", 2010), "Google");
        tm.put(new Platform("Instagram", 2000), "Meta");
        tm.put(new Platform("ChatGpt", 2022), "OpenAi");

        System.out.println(tm);
    }
}
