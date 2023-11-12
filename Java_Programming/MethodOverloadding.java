class Real{
    public void runner(){
        System.out.println("Runner with no parameter");
    }
    public void runner(String name){
        System.out.println("Runner with String "+name);
    }
    public void runner(int number){
        System.out.println("Runner with number "+number);
    }
}
public class MethodOverloadding {
    public static void main(String[] args) {
        System.out.println("Example of Function/Method Overloadding");
        Real obj  = new Real();
        obj.runner();
        obj.runner(18);
        obj.runner("Abu Yousuf");
    }
}
