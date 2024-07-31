import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
        Iterator<Integer> i = myHashSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}