class box{
    int height;
    int width;
    int length;
    int volume;
    void volume()
    {
        volume = height * width * length;
    }
    void volume(int n)
    {
        volume = n;
    }
}

public class program2 {
    public static void main(String[] args){
        box obj = new box();
        obj.height = 1;
        obj.width = 5;
        obj.length = 5;
        obj.volume(5);
        System.out.println(obj.volume);
    }
}
