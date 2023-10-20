import java.util.Scanner;

public class get_all {
      public static void main(String[] args)
    {
        System.out.print("Please enter your name, age, and slary: ");
        Scanner scan = null;
        try{
            scan = new Scanner(System.in);
            String a = scan.nextLine();
            //System.out.println("Your name is: "+a);
            int b = scan.nextInt();
            //
            float s = scan.nextFloat();
            System.out.println("Your Name is: "+a);
            System.out.println("Your Age is: "+b);
            System.out.println("Your Slary is: "+s);
        }finally{
            if(scan  != null)
            {
                scan.close();
            }
        }
    }
}
