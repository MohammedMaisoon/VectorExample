import java.util.Vector;
public class Vector_Example {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println(vector);
        System.out.println("First element: " + vector.get(0));
        for (String fruit : vector) {
            System.out.println(fruit);
        }
        vector.remove("Banana");
        System.out.println("Vector size: " + vector.size());
    }
}