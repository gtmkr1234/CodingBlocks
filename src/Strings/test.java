package Strings;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        List<Character> vowels =new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int count=0;
        int maxlen=0;
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))){
                count++;
                maxlen = Math.max(maxlen,count);
            }
            else{
                count=0;
            }
        }
        System.out.println(maxlen);
    }
}
