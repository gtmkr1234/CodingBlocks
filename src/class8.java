import java.lang.Exception;


public class class8 {
    public static void main(String[] args) throws ArithmeticException{
        int[] arr = {1,2,3,4};
        int pdt = 1;
        for (int i = 0; i < arr.length; i++) {
            pdt*=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(pdt/arr[i]);
        }
    }
}
