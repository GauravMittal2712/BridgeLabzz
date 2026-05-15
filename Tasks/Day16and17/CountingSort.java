 import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 10, 15, 14};

        int max = 18;

        int[] count = new int[max + 1];

        for (int age : ages) {
            count[age]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                ages[index++] = i;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(ages));
    }
}
