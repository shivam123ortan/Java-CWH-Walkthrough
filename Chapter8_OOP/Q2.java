class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
}
public class Q2 {
    public static void main(String[] args) {
        cellphone doi = new cellphone();

        doi.ring();
        doi.vibrate();
    }
    
}
