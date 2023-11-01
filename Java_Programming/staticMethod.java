class New{
    void getName(String n){
        System.out.println("Your name is: "+n);
        // New ovj2 = new New();
        // System.out.println(ovj2.roll());
        // int r = roll();
        // System.out.println();
        roll();


    }
    static void roll(){
        System.out.println("Roll is: 180634");
    }
}

public class staticMethod {
    public static void main(String[] args) {
        New obj = new New();
        obj.getName("Abul Kalam");
        //System.out.println(obj.roll());
    }
}
