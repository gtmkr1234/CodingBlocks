package Assignments.Ass1;

import java.util.*;
public class prime {
    static List<Integer> factors(int n){
        List<Integer> res = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                res.add(i);
            }
        }
        return res;
    }


    static boolean isPrime(int n){
        if(factors(n).size()==2){
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number_check = s.nextInt();
        System.out.println(isPrime(number_check)?"Prime":"Not Prime");

    }
}