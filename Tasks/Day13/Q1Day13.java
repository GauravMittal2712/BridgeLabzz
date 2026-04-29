import java.util.*;

// 🔷 Generic utility class (Core logic)
class MaxFinder {

    // UC1, UC2, UC3 → Generic method for 3 values
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    // UC4 → For multiple values
    public static <T extends Comparable<T>> T findMax(T... values) {
        List<T> list = Arrays.asList(values);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}


// 🔷 Generic Class (Refactor 2)
class MaxTest<T extends Comparable<T>> {

    T x, y, z;

    // Constructor
    MaxTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to get maximum
    public T testMaximum() {
        return MaxFinder.findMax(x, y, z);
    }

    // UC5 → Print method
    public void printMax() {
        System.out.println("Maximum value is: " + testMaximum());
    }
}


// 🔷 Main Class
public class Q1Day13 {
    public static void main(String[] args) {

        MaxTest<Integer> intTest1 = new MaxTest<>(30, 20, 10); // max at 1st
        intTest1.printMax();

        MaxTest<Integer> intTest2 = new MaxTest<>(10, 40, 20); // max at 2nd
        intTest2.printMax();

        MaxTest<Integer> intTest3 = new MaxTest<>(10, 20, 50); // max at 3rd
        intTest3.printMax();

        MaxTest<Float> floatTest1 = new MaxTest<>(30.5f, 20.2f, 10.1f);
        floatTest1.printMax();

        MaxTest<Float> floatTest2 = new MaxTest<>(10.5f, 40.7f, 20.3f);
        floatTest2.printMax();

        MaxTest<Float> floatTest3 = new MaxTest<>(10.5f, 20.3f, 50.9f);
        floatTest3.printMax();

        MaxTest<String> stringTest1 = new MaxTest<>("Peach", "Apple", "Banana");
        stringTest1.printMax();

        MaxTest<String> stringTest2 = new MaxTest<>("Apple", "Peach", "Banana");
        stringTest2.printMax();

        MaxTest<String> stringTest3 = new MaxTest<>("Apple", "Banana", "Peach");
        stringTest3.printMax();


        Integer maxInt = MaxFinder.findMax(3, 7, 2, 9, 5, 12);
        System.out.println("Max from multiple Integers: " + maxInt);

        Float maxFloat = MaxFinder.findMax(2.5f, 7.1f, 1.2f, 9.8f);
        System.out.println("Max from multiple Floats: " + maxFloat);

        String maxStr = MaxFinder.findMax("Dog", "Cat", "Elephant", "Bat");
        System.out.println("Max from multiple Strings: " + maxStr);
    }
}