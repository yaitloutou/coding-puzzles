package io.yaitloutou.puzzels.power;

/**
 *
 * @author yaitloutou
 */
public class Power {
    /**
     * Given tow integer `n` and `p`(p>0) , write a function
     * to determine if `n` is a power of `p`.
     * 
     * @param n
     * @param p 
     * @return 
     */
    public static boolean isPowerOf(int n, int p) {
        if(p==1 || n<p) return n==1;
        while(n>=p){
            if(n%p!=0) return false;
            else n/=p;
        }        
        return n==1;
    }
    
    public static boolean isPowerOfUsingRecursion(int n, int p) {
        boolean stopCondition = p == 1 ||  n < p || (n % p != 0);
        if (stopCondition)
            return n == 1;
        else
            return isPowerOfUsingRecursion(n /= p, p);        
    }
    
    public static boolean isPowerOfTow(int n) {
        return n>0 && !Integer.toBinaryString(n).substring(1).contains("1");
    }
    
    public static boolean isPowerOfTowUsingMask(int n) {
        String binaryString = Integer.toBinaryString(n);
        long mask = (long)Math.pow(2, binaryString.length()-1)-1;
        return n>0 && ((n & mask)==0);
    }
    
    public static boolean isPowerOfFour(int n) {
        if((n&1)==1) return n==1;
        String bs =Integer.toBinaryString(n/2).substring(1);
        return n>0 && !bs.contains("1") && (bs.length()&1)==1;
    }
    
    
    
}
