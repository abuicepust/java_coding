import java.util.Scanner;

public class get_string_input {
    public static void main(String[] args)
    {
        System.out.print("Please enter your name: ");

        Scanner scan = null;
        try{
            scan = new Scanner(System.in);
            String a = scan.nextLine();
            System.out.println("Your name is: "+a);
        }finally{
            if(scan  != null)
            {
                scan.close();
            }
        }
    }
    
}
