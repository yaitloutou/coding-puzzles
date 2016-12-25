/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.yaitloutou.puzzels.bits;

import sun.security.util.Length;

/**
 * Write a function that takes an unsigned integer and returns 
 * the number of ’1' bits it has (also known as the Hamming weight).
 * 
 * @see https://leetcode.com/problems/number-of-1-bits/
 * 
 * @author yaitloutou
 */
public class HammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        char[] bs = Integer.toBinaryString(n).toCharArray();
        int h=0;
        for(int i=0;i<bs.length;i++){
            h+=bs[i]-'0';
        }
        return h;
    }
    
    public static int hammingWeight2(int n) {
        String bs = Integer.toBinaryString(n);
        int h = bs.length()- bs.replace("1", "").length();        
        return h;
    }
    
}
