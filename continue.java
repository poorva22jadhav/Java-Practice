import java.util.Scanner;

 class ContinueExample2 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 positive integers: ");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Negative numbers are not allowed. Please try again.");
               
                i--; // Decrement i to repeat the same iteration
                continue;
            }
            
            System.out.println("You entered a positive number: " + num);
        }

        scanner.close();
    }
}
