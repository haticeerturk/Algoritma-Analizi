/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usalma;

/**
 *
 * @author BM
 */
public class UsAlma {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        System.out.println("Sonuc: "+power(2));
    }
 
    public static double power(int x){
        double x1 = x * x *x; // x^2
        double x2 = x1 * x1; // x^4
        double x3 = x2 * x2 * x1; // x^10
        double x4 = x3 * x3 * x; // x^24
        double x5 = x4 * x4; // x^32
        
        return x5;
    }
}
