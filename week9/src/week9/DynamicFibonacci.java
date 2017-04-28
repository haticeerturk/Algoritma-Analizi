/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week9;

/**
 *
 * @author BM
 */
public class DynamicFibonacci {
    public int fibDP(int x) {
        int fib[] = new int[x + 1];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < x + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        return fib[x];
    }
}
