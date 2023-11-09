abstract class Iphone{
    public void Feature(){
        System.out.println("This is feature method");
    }
    abstract void movie();
}
class AnyPhone extends Iphone{
    public void movie(){
        System.out.println("This is normal class");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        System.out.println("This is example of Abstract Class");
        AnyPhone obj  = new AnyPhone();
        obj.movie();
        obj.Feature();

    }
}
