public class class4_2 {
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a+"\n"+b);
        for (int i = 0; i < 20; i++) {
            int next = a+b;
            System.out.println(next);
            a=b;
            b = next;
        }
    }
}
