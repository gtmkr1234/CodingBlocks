public class class8_2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                max = Math.max(sum,max);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum sum of subarray is: " + max);
    }
}
