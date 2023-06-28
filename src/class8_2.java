
import java.util.ArrayList;
import java.util.*;

public class class8_2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int max =0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                List<Integer> temp= new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                    temp.add(arr[k]);
                }
                if(sum>max){
                    res = temp;
                    max = Math.max(sum,max);
                }
            }
        }

        System.out.println("Maximum sum of subarray is: " + max);
        System.out.println("Maximum sub array is : "+ res);
    }
}
