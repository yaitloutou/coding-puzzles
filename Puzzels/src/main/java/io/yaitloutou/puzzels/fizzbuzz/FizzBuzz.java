/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.yaitloutou.puzzels.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author yaitloutou
 */
public class FizzBuzz {
    public static List<String> solution(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean d3 = i % 3 == 0, d5 = i % 5 == 0;
            list.add(
                    (d3 && d5) ? "FizzBuzz" : (d3 ? "Fizz" : (d5 ? "Buzz" : i + ""))
            );
        }
        return list;
    }
}
