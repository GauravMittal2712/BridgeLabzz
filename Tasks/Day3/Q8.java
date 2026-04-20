public class Q8 {
    public static void main(String[] args) {
        int[] arr ={55,4477,99,56,1,4,1,4,4546,1,321,9};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){  // ✔ fixed
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
