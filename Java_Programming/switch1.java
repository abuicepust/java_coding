import java.util.Scanner;

public class switch1 {
    public static void main(String[] args){
        System.out.println("Abu");

        System.out.println("Enter your age: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        //int n = 10;
        switch(n){
            case 18:
            {
                System.out.println("He is adult");
                break;
            }
            default:
                System.out.println("Not an adult");
        }
    }
}
