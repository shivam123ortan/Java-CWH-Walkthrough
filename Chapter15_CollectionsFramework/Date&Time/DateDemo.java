
import java.util.Date;
public class DateDemo {

    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis());
        // System.out.println(Long.MAX_VALUE);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());    
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}