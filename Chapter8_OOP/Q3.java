class square{
    int a;
    public int side(){
        return a;
    }
    public int area(){
        return a*a;
    }
    public int parimeter(){
        return a*4;
    }
}
public class Q3 {
    public static void main(String[] args) {
        square s = new square();
        s.a = 7;
        System.out.println(s.area());
    }
}
