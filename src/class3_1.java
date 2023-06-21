public class class3_1 {
    public static void main(String[] args) {
        int n=7;
        int row=0;
        int nst1=n/2 + 1;
        int nst2 = n/2 ;
        int nsp = -1;
        while(row<n+1){
            for (int i = 0; i < nst1 ; i++) {
                System.out.print("* ");
            }
            for (int i = 0; i < 2*nsp; i++) {
                System.out.print("  ");
            }
            if(row==n-1){
                nst2--;
            }
            for (int i = 0; i < nst2;  i++) {
                System.out.print("* ");
            }
            if(row<n/2){
                nst1--;
                if(row !=0 ){
                nst2--;}
                nsp+=1;
            }
            else{
                nst1+=1;
                nst2++;
                nsp-=1;
            }
            System.out.println();
            row++;
        }
    }
}
