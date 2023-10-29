import java.util.Scanner;
public class ScannerClass3 {
    public static void main(String[] args) {
        System.out.println("This is the Scanner class in 2D Array: ");
        System.out.println("Please enter the array size [n1] [n2]");
        //int n1,n2;
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int arr[][] = new int[n1][n2];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Elements are: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
