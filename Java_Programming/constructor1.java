public class constructor1 {
    public static void main(String[] args) {
        System.out.println("Example of constructor");
        // person obj = new person();
        // obj.display();

        new person();


    }
}

class person{
    String name = "Sunil Shetty";
    int age = 28;
    // void display(){
    //     System.out.println(name+" Is "+age+" Years old");
    // }

    person(){
        System.out.println(name+" Is "+age+" Years old");
    }
}

