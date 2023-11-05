class Parent{
    String name = "Kader";
    void getData(){
        System.out.println(this.name);
    }
}
class Child extends Parent{

}
public class inheritance1 {
    public static void main(String[] args) {
        System.out.println("This is example of Inheritance");
        Parent obj = new Parent();
        obj.getData();
        Child obj2 = new Child();
        obj2.name = "Molla";
        obj2.getData();
    }
}
