class Outer {
    private static int outerStaticVar;
    private int outerInstanceVar=3;

    static class StaticNested {
        static void display() {
            System.out.println("Outer static variable: " + outerStaticVar);
           
        }
    }
}

class Main {
    public static void main(String[] args) {
        Outer.StaticNested nestedObj = new Outer.StaticNested();
        Outer.StaticNested.display();
         
    }
}

