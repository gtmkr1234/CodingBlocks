package Strings;

public class class1 {
    static boolean isPalin(String s){
        int start=0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = new String("Hello");
//
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.compareTo(s3));

        String s = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String st = s.substring(i,j+1);
                if(isPalin(st)){
                    System.out.println(st);
                }
            }
        }
    }
}
