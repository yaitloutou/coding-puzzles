/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.yaitloutou.puzzels.bits;

/**
 * @see https://leetcode.com/problems/hamming-distance/
 *
 * @author yaitloutou
 */
public class HammingDistance {

    public static int solution0(int x, int y) {
        //System.out.println(x+" "+y);        
        String bs = Integer.toBinaryString(x ^ y);
        //System.out.println(bs);
        int h = 0;
        for (int i = 0; i < bs.length(); i++) {
            h += Integer.parseInt(bs.charAt(i) + "");
        }
        return h;
    }
    
    public static int solution1(int x, int y) {
        // using hamming wheight
        return HammingWeight.solution1(x^y);
    }
}
