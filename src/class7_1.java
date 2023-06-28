import java.util.Arrays;

public class class7_1 {
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,0,48,9,45,55,78,12};
        selectionSort(arr);
    }
}
