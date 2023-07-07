import java.util.*;
public class class11_1{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int cmin=0;
        int rmin=0;
        int cmax = arr[0].length-1;
        int rmax = arr.length-1;

        while(cmin<cmax && rmin<rmax){
            for (int i = cmin; i <= cmax; i++) {
                System.out.print(arr[rmin][i]+" ");
            }
            rmin++;
            System.out.println();

            for (int i = rmin; i <= rmax; i++) {
                System.out.print(arr[i][cmax]+" ");
            }
            cmax--;
            System.out.println();

            for (int i = cmax; i >= cmin; i--) {
                System.out.print(arr[rmax][i]+" ");
            }
            rmax--;
            System.out.println();

            for (int i = rmax; i>=rmin; i--) {
                System.out.print(arr[i][cmin]+" ");
            }
            cmin++;
            System.out.println();
        }

    }
}