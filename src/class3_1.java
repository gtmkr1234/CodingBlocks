public class class3_1 {
    public static void main(String[] args) {
        int n=7;
        int row=0;
        int nst=6;
        int nsp = 1;
        while(row<n){
            for (int i = 0; i < nst/2; i++) {
                System.out.print("* ");
            }
            for (int i = 0; i < nsp; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < nst/2; i++) {
                System.out.print("* ");
            }
            if(row<n/2){
                nst-=2;
                nsp+=2;
            }
            else{
                nst+=2;
                nsp-=2;
            }
            System.out.println();
            row++;
        }
    }
}
