import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int [] n = {3,5,6,7,9,3445,23,1,24,7};
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        boolean isInArray = false;
        for (int element:n){
            if (e == element){
                isInArray = true;
                break;
            }
            
        }
        if (isInArray) {
            System.out.printf("Yes, %d is present in the array",e);
        }
        else {
            System.out.printf("No, %d is not present in the array",e);

        }
    }
}
