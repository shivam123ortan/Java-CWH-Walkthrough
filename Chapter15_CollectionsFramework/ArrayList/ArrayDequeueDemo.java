import java.util.ArrayDeque;
public class ArrayDequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.peek();
        ad1.pop();
        ad1.poll();
        ad1.push(55);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
    
}
