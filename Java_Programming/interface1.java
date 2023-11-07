interface drive{
    
    void car();
    void stop();
    
}
class hlo implements drive{
    String name = "Name of the car is Audi";
    public void car(){
        System.out.println("Inside drive implement method");
    }
    public void stop(){
        System.out.println("Please stop the car");
    }
}
public class interface1 {
    public static void main(String[] args) {
        System.out.println("Example of interface");
        hlo obj = new hlo();
        obj.car();
        obj.stop();
        System.out.println(obj.name);
    }
}
