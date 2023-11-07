class Parent_{
    void run5(){
        System.out.println("This is parent class");
    }
}

class Child_ extends Parent_{
    void run2(){
        System.out.println("This is child class1");
    }
}
class Child1_ extends Parent_{
    void run3(){
        System.out.println("This is parent class2");
    }
}
public class HirarchicalInharitance {
    public static void main(String[] args) {
        System.out.println("This is Hirarchical Inheritance");
        Child_ obj = new Child_();
        obj.run2();
        obj.run5();
    }
}
