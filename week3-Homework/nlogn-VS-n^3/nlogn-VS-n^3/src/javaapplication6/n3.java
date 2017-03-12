/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.*;

/**
 *
 * @author hatice
 */
public class n3 {
    public static ArrayList<Integer> sol = new ArrayList<Integer>();
    public static ArrayList<Integer> sag = new ArrayList<Integer>();
    
    private static int maxSum(ArrayList<Integer> a){
        int maxSum = 0;
        
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.size(); j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum = thisSum + a.get(k);
                }
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }
    
    private static void diziyiBol(ArrayList<Integer> dizi) {
       int orta = dizi.size() / 2;
       
       for (int i = 0; i < orta; i++) {
           sol.add(dizi.get(i));
       }
       
       for (int i = dizi.size()-orta; i < dizi.size(); i++) {
           sag.add(dizi.get(i));
       }
    }
    
    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        
        ArrayList<Integer> dizi = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            Random rand = new Random();

            int eleman = rand.nextInt(10000) + 1; 
            dizi.add(eleman);
        }
        
        diziyiBol(dizi);        
 
        int toplam = maxSum(sol) + maxSum(sag);
        
        long last = System.currentTimeMillis();
        
        System.out.println("Çalışma Süresi(milisaniye): "+(last-first));
        System.out.println("İki listenin max. toplamlarının toplamı: "+toplam);
    }
    
}
