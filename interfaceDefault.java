interface MyInterface {
    // Static method in the interface
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}
class Main {
    public static void main(String[] args) {
        MyInterface.staticMethod(); // Output: This is a static method in the interface.
    }
}

