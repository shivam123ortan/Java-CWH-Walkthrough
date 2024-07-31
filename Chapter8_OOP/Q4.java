class Rectangele{
    int a;
    int b;
    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Rectangele r = new Rectangele();
        r.a = 4;
        r.b = 6;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
    
}
