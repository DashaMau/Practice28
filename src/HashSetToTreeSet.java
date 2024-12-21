import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Grapes");


        System.out.println("HashSet elements: " + hashSet);


        TreeSet<String> treeSet = new TreeSet<>(hashSet);


        System.out.println("TreeSet elements (sorted): " + treeSet);
    }
}

