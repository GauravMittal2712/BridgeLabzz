public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {55, 88, 66, 77, 44, 99, 25, 33};
        Bubblesorting bs = new Bubblesorting();
        bs.bubblesorting(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

class Bubblesorting {
    public void bubblesorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean istrue = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    istrue = true;
                }
            }

            if (!istrue) {
                break;
            }
        }
    }
}