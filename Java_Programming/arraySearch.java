import java.util.Scanner;
public class arraySearch {
    public static void main(String[] args) {
        System.out.println("Search from the array");
        System.out.print("Enter the number you want to search: ");
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int arr[] = {13,14,56,12,123};
        int q = 0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == n)
            {
                System.out.println(n+" is at index "+(i+1));
                q++;
                break;
            }
        }
        if(q == 0){
            System.out.println("Not found");
        }
        scan.close();
        
    }
}
