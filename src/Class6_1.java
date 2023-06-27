public class Class6_1 {
    static int funct(int[] arr, int key){
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,-10,-11,2,7,9,2,11};
        System.out.println(funct(arr, 2));
    }
}
