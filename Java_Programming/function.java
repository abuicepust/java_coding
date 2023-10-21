class abu{
    void sum(int a, int b)
    {
        int num1,num2,s;
        num1 = a;
        num2 = b;
        s = num1 + num2;
        System.out.println("The sum is: "+s);
        
    }
}


public class function {
    public static void main(String[] args)
    {
        System.out.println("Hello this is function");
        abu f1 = new abu();
        f1.sum(11,8);
    }
}
