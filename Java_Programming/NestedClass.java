class Student{
    void name(){
        System.out.println("Name is Sujon");
        roll obj2 = new roll();
        obj2.troll();
    }
    class roll{
        int roll = 180613;
        void troll(){
            System.out.println("Roll is: "+this.roll);
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name();
    }
}
