public class Q7 {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 7, 4, 8, 1, 45, 76, 23};
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
