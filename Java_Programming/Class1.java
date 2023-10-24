public class Class1{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Jabbar obj = new Jabbar();
        obj.display();
    }
}

class Jabbar{
    String name = "Abdul Jabbar";
    int age = 28;
    int roll = 34;
    void display()
    {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Roll is: "+roll);
    }
}

