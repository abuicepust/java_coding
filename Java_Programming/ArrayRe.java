import java.util.Scanner;

public class ArrayRe {
    public static void main(String[] args) {
        // int[] a = {1,2,3,4};
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers: ");
        int b = scan.nextInt();
        int[] a = new int[b];
        for(int i=0;i<b;i++){
            a[i] = scan.nextInt();
        }       

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int i : a) {
            System.out.println(i);
        }
        scan.close();
    }
}
