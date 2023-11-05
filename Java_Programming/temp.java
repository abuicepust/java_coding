class vab {
    int x = 10;
    int y = 25;
    int tmp;
    {
        tmp = x;
        x = y;
        y = tmp;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

}

public class temp {
    public static void main(String[] args) {
        int x = 10;
        int y = 25;
        x = x ^ y;
        y = x ^ y;
        System.out.println(x);
        System.out.println(y);
        vab obj = new vab();
        obj.display();
    }
}
