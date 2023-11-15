public class Throw2{
    public static void main(String[] args) {
        System.out.println("How throws works");

        try{
            runs();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void runs() throws Exception{
        System.out.println(10/0);
    }
}