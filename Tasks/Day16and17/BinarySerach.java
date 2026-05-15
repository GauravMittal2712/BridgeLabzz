public class BinarySerach {

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }

        System.out.println("Peak Element: " + arr[left]);
    }
}