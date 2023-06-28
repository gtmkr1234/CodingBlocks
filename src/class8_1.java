import java.util.Arrays;
import java.util.Scanner;

public class class8_1 {

    static int[] product(int[] arr){
        int [] left = new int[arr.length];
        int [] right = new int[arr.length];
        int product =1;
        left[0] = product;
        right[right.length-1] = product;

        for (int i = 1; i < left.length; i++) {
            product*=arr[i-1];
            left[i] = product;
        }
        product=1;
        for (int i = right.length-2; i >=0 ; i--) {
            product*=arr[i+1];
            right[i] = product;
        }
        int[] res = new int[right.length];
        for (int i = 0; i < right.length; i++) {
            res[i] = left[i]*right[i];
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(product(arr)));
    }
}
