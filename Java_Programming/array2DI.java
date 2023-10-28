import java.util.Scanner;
public class array2DI {
    static public void main(String[] args){
        System.out.println("Taking input from user: ");
        System.out.println("Please enter the array size [n][n]");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int arr[][] = new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.println("Please enter the element of [ "+i+" ] [ "+j+" ]");
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
