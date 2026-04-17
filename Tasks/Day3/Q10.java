import java.util.Collections;
import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        int[] arr ={55,4477,99,56,1,4,1,4,4546,1,321,9};
        HashSet<Integer> seet = new HashSet<>();
        for(int num : arr){
            seet.add(num);
        }
        int larg= Collections.max(seet);
        seet.remove(larg);
        int antil = Collections.max(seet);
        System.out.println(antil);
    }
}
