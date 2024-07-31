import java.time.LocalDateTime;
import java.time.format.*;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy.a -- E");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);
        System.out.println(myDate);
    }
    
}
