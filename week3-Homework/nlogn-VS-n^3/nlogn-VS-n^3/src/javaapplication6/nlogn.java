/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hatice
 */
public class nlogn {
    
    private static int OrtayiBul(ArrayList<Integer> dizi) {
        int orta = dizi.size() / 2;
        int sumLeftMax=0, sumRightMax=0;
        int sumLeft=0, sumRight=0;
        
        for (int i = orta-1; i > -1; i--) {
            sumLeft += dizi.get(i);
            
            if (sumLeft > sumLeftMax) {
                sumLeftMax = sumLeft;
            }
        }

        for (int i = orta; i < dizi.size(); i++) {
            sumRight += dizi.get(i);
            
            if (sumRight > sumRightMax) {
                sumRightMax = sumRight;
            }
        }
        return (sumLeftMax + sumRightMax);
    }
    
    private static Integer findMaxInTriple(int a, int b, int c) {
        if (a > b) {
            if (b > c || a > c) {
                return a;
            }
            else {
                return c;
            }
        }
        else if (b > c) {
            return b;
        }
        else {
            return c;
        }
    }
    
    private static Integer recursiveMaxSum(ArrayList<Integer> array){
        if (array.size() < 2) {
            return array.get(0);
        } else {
            int orta = array.size() / 2;
            
            int sumLeft = recursiveMaxSum(new ArrayList(array.subList(0, orta)));
            int sumRight = recursiveMaxSum(new ArrayList(array.subList(orta, array.size())));
            int sumMiddle = OrtayiBul(array);
            
            return findMaxInTriple(sumLeft, sumRight, sumMiddle);
        }
    }
    
    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        
        ArrayList<Integer> dizi = new ArrayList<Integer>();
        
        for (int i = 0; i < 100000; i++) {
            Random rand = new Random();

            int eleman = rand.nextInt(100000) + 1; 
            dizi.add(eleman);
        }
        
        int sonuc = recursiveMaxSum(dizi);
        
        long last = System.currentTimeMillis();
        
        System.out.println("İki listenin max. toplamlarının toplamı: "+ sonuc);
        System.out.println("Çalışma Süresi(milisaniye): "+(last-first));
    }
}
