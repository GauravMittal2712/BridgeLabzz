public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={55,77,14,22,6,65,8,3,1,49};
        Insertionsorting is =  new Insertionsorting();
        is.insertionsorting(arr);
        for (int num:arr) {
            System.out.println(num+" ");
        }


    }
}
class Insertionsorting{
    public void insertionsorting(int arr[]){
        int key,i,j;
        for(i=1;i<arr.length;i++){
            j=i-1;
            key=arr[i];
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
}
