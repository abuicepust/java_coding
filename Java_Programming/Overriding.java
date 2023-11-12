class F1 {
    void displayName(String name1) {
        System.out.println("Name is: " + name1);
        System.out.println("Hello World");
    }
}

class F2 extends F1 {
    void displayName(String name1) {
        System.out.println("Name is: " + name1);
        System.out.println("This is child class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        System.out.println("Example of Function/Method Overriding");
        F2 obj = new F2();
        obj.displayName("Abu Yousuf");
    }
}