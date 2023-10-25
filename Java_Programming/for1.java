import java.util.Scanner;
public class for1{
public static void main(String[] args){
        System.out.println("This is for loop");
        System.out.println("Enter the number: ");
        Scanner f1 = new Scanner(System.in);
        int n = f1.nextInt();
        

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        f1.close();
    }
}