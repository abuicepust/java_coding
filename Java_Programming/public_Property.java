class Parent1{
    public
    String name = "Jaddu Vai";
    void getData(){
        System.out.println(name);
    }
    private
    String name2 = "MSD";
    @Suppress private void getName2(){
        System.out.println(name2);
    }
}
class Child1 extends Parent1{

}
public class public_Property {
    public static void main(String[] args) {
        System.out.println("This is the example of Public property");
        Child1 obj = new Child1();
        obj.getData();

        //obj.getName2();
    }
}
