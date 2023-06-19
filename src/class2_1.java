public class class2_1 {
    public static void main(String[] args) {
        int n=5;
        int nst = 2*n-1;
        int nsp = 0;

        int row =0;
        while(row++<n){
            for (int i = 0; i < nsp; i++) {
                System.out.print("  ");
            }
            nsp++;
            for (int i = 0; i < nst; i++) {
                System.out.print("* ");
            }
            nst-=2;
            System.out.println();
        }
    }
}
