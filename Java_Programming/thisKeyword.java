public class thisKeyword {
    public static void main(String[] args){
        Sozol obj = new Sozol();
        System.out.println(obj.name);
        System.out.println(obj.getname());
        System.out.println(obj.getRoll());
    }
}

class Sozol{
    String name = "Sozol Saidul";
    int roll = 180609;
    String getname(){
        return this.name;
    }
    int getRoll(){
        return roll;
    }
}
