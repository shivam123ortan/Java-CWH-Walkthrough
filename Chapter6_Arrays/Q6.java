public class Q6 {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 7, 4, 8, 45, 76, 23};
        int max = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
