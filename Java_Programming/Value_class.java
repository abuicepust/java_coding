
public class Value_class {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Jabber boj = new Jabber();
        boj.display(12,23);
    }
}

class Jabber{
    void display(int n,int n2){
        System.out.println("This is inside class Jabber");
        System.out.println("Number is: "+n);
        System.out.println("Number is: "+n2);
    }
}
