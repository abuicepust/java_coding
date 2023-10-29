import java.util.Scanner;
public class ScannerClass2 {
    public static void main(String[] args) {
        System.out.println("This code is for 1D array with scanner");
        System.out.println("Enter the number of element in array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

         for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        scan.close();

    }
}
