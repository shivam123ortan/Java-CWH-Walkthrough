public class Q1 {
    public static void main(String[] args) {
        float [] flts = {45.5f,  34.2f, 12.4f, 56.4f, 78.4f};
        float sum = 0;
        for (float element:flts){
            sum = sum + element;
        }
        System.out.println(sum);
    }
}
