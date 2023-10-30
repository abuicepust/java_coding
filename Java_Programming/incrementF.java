class Inside{
    static int x;
    static int y;
    void in(int a, int b){
        x = x+ a;
        y = x + b;
    }
}

public class incrementF {
    public static void main(String[] args){
        Inside obj1 = new Inside();
        Inside obj2 = new Inside();
        int p = 1;
        obj1.in(p, p+1);
        obj2.in(5, p);
        System.out.println(obj1.x+" "+obj2.y);      
    }
}
