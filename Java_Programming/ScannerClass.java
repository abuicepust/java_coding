import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args){
        System.out.println("This code is all about Scanner class");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str);
        scan.close();
    }
}
