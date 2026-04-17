public class Q3 {
    public static void main(String[] args) {
        int[] arr = {55,44,66,22,88,44,33,11,99,123,4,64,81,2,321,5};
        int largest = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>arr[0]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
