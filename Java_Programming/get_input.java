import java.util.Scanner;

public class get_input {
    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");

        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // System.out.println("The number A is: "+a);
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            // rest of the code
            int a = scanner.nextInt();
            System.out.println("The number A is: "+a);
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}