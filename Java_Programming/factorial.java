import java.util.Scanner;
class factorial1{
        int factorial2(int a){
        if(a==1){
            return a;
        }else{
            return a * factorial2(a-1);
        }
        
    }
}
public class factorial {
    public static void main(String[] args) {
        System.out.println("Please Enter the value: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        factorial1 obj1 =new factorial1();
        int value = obj1.factorial2(n);
        System.out.println(value);
        obj.close();
    }
}
