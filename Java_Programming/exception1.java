import java.util.Scanner;
class division{
    int Fun(int a, int b){
       return a/b; 
    }
}
public class exception1 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        //int number1,numbr2;
        Scanner num = new Scanner(System.in);
        int number1 = num.nextInt();
        int number2 = num.nextInt();
        num.close();
        division obj = new division();
        try{
            System.out.println("Result of division is: "+obj.Fun(number1, number2));
        }catch(Exception error){
            System.out.println("Something went wrong");
        }
    }
}
