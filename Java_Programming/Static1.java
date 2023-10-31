class div{
    //int i = 0;
    static int i = 0;
    void getvalue(){
        i++;
        System.out.println(i);
    }
}
public class Static1 {
    public static void main(String[] args) {
        System.out.println("Memory Management using Static");

        div obj1 = new div();
        div obj2 = new div();

        obj1.getvalue();
        obj2.getvalue();
    }
}
