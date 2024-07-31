/**
 * Q6
 */
public class Q6 {
    static float avg(int ...arr){
        float l = arr.length;
        float result = 0;
        for (int a: arr){
            result = result + a;
        }
        return result/l;
    }
    public static void main(String[] args) {
        System.out.println(avg(82,21,45,3,5,6,7,8,8));
    }
}