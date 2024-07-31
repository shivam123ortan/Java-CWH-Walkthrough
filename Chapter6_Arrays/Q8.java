public class Q8 {
    public static void main(String[] args) {
        int [] arr = {4, 5, 7, 8, 8};
        boolean isSorted = true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
