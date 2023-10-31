public class constructro2 {
    public static void main(String[] args) {
        String name = "Imaran Nazir";
        Person1 obj = new Person1(name);
        System.out.println(obj.name1);
    }
}
class Person1{
    String name1;
    Person1(String data){
        // System.out.println(name);
        this.name1 = data;
    }
}