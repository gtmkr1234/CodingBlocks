public class class12 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=n; i>0; i--){
            for(int j=1; j<= n-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
