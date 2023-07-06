import java.util.Scanner;

public class class10_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] arr = {{10,11,12,13},
                        {20,21,22,23},
                        {30,31,32,33},
                        {40,41,42,43}};
        int ind =0;
        while(ind<=arr[0].length-1){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][ind]+" ");
            }
            System.out.println();
            ind+=1;
            for (int i = arr.length-1; i >= 0 ; i--) {
                System.out.print(arr[i][ind]+" ");
            }
            ind+=1;
            System.out.println();
        }

    }
}
