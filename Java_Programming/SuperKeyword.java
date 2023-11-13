class Ah {
    void getWord() {
        System.out.println("Word is running");
    }
}

// class Word1 extends Ah{
// void GetWord2(){
// super.getWord();
// }
// }
class Word1 extends Ah {
    // void GetWord2(){
    // super.getWord();
    // }
    void we() {
        Ah obj1 = new Ah();
        obj1.getWord();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("This is the Use of Super keyword");
        Word1 obj = new Word1();
        // obj.GetWord2();
        obj.we();
    }
}