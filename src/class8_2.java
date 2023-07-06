
import java.util.ArrayList;
import java.util.*;

public class class8_2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,-10,-4};
        int min =Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                List<Integer> temp= new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                    temp.add(arr[k]);
                }
                if(sum<min){
                    res = temp;
                    min = Math.min(sum,min);
                }
            }
        }

        System.out.println("Minimum sum of subarray is: " + min);
        System.out.println("Minimum sub array is : "+ res);
    }
}
