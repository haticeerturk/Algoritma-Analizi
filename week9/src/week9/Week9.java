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
public class Week9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatrisCarpma mc = new MatrisCarpma();
        DynamicFibonacci df = new DynamicFibonacci();
        
        int[][] m1 = new int[][]{{1,2,3},{3,3,3},{5,6,2}};
        int[][] m2 = new int[][]{{1,5,3},{2,9,6},{7,8,5}};
        
        
        mc.matrisYazdir(mc.matrisCarpim(m1, m2));
        
        System.out.println("Dynamic Fibonacci: "+df.fibDP(6));
    }
    
}
