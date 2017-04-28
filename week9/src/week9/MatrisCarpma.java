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
public class MatrisCarpma {
    public MatrisCarpma(){
        
    }
    
    public static int[][] matrisCarpim(int[][] m1, int[][] m2){
        int[][] m3 = new int[m1.length][m2[0].length];

        for(int i=0; i < m1.length; i++){
            for(int j=0; j < m2[0].length; j++){
                for(int k=0; k < m2.length; k++){
                    m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];
                }
            }
        }
        return m3;
    }
    
    public static void matrisYazdir(int[][] m3){
        for(int i=0; i < m3.length; i++){
            for(int j=0; j < m3[0].length; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
