import javax.lang.model.element.Element;

public class Q3 {
    public static void main(String[] args) {
        float [] marks = {45,76,89,54,99,67,89,78};
        float sum = 0;
        for (float element:marks){
             sum = sum + element;
        }
        float avg =  sum/marks.length;
        System.out.println(avg);
    }
    
}
