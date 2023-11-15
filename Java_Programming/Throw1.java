public class Throw1{
    public static void main(String[] args) {
        System.out.println("How throw works");

        try{
            System.out.println(10/5);
            throw new Exception("Some error");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}