import java.util.Scanner;
class division2{
    int Fun2(int a, int b){
       return a/b; 
    }
}
public class FinallyBlock {
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
            System.out.println(error);
        }finally{
            System.out.println("This block will always run");
        }
    }
}
