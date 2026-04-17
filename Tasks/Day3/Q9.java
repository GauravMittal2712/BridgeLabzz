import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] arr ={55,4477,99,56,1,4,1,4,4546,1,321,9};
        Arrays.sort(arr);
        for(int num : arr){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));
    }
}
