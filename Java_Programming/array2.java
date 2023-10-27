import java.util.Scanner;

public class array2 {
    public static void main(String[] args){
        System.out.println("This is array in java");
        //int arr[] = {1,2,4,8,9};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {   
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<=n-1;i++)
        {
            System.out.println("index of arr["+i+"] is: "+arr[i]);
        }
        scan.close();
    }
}
