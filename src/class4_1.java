public class class4_1 {
    public static boolean isPrime(int n){
        int limit = (int) Math.sqrt(n);
        if(n==1|| n==2)
            return true;
        for (int i = 2; i <= limit; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=20;
        for (int i = 1; i <=n ; i++) {
            if(isPrime(i))
                System.out.println(i);
        }

    }
}
