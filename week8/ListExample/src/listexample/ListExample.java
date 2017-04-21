/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BM
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static float Gauss(float eleman, float avarage, float std){
        float carpan = (float) (1 / Math.sqrt(2*(3.14)*std*avarage));
        return (float) (carpan*Math.pow((2.718),(-1*(eleman-avarage)*(eleman-avarage)/(2*std*std))));
    }
    
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();
        int enKucuk, enBuyuk;
        float avarage = 0, varyans = 0;
           
        for (int i = 0; i < 10; i++) {
            liste.add(i);
        }
        
        enKucuk = liste.get(0);
        enBuyuk = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            avarage += liste.get(i);
            if(liste.get(i) < enKucuk) enKucuk = liste.get(i);
            if(liste.get(i) > enBuyuk) enBuyuk = liste.get(i);
        }
        avarage += liste.get(0);
        avarage = avarage/liste.size();
        
        for (int i = 0; i < liste.size(); i++) {
            double fark = avarage - liste.get(i);
            fark *= fark;
            varyans += fark;
        }
        
        System.out.println("En küçük eleman: "+enKucuk);
        System.out.println("En büyük eleman: "+enBuyuk);
        System.out.println("Avarage: "+avarage);
        System.out.println("Standart Sapma: "+Math.sqrt(varyans/(liste.size()-1)));
        System.out.println("Varyans: "+varyans/liste.size());
        for (int i = 0; i < liste.size(); i++) {
            System.out.println("Gauss Dağılımı: "+Gauss(liste.get(i),avarage, (float) Math.sqrt(varyans/(liste.size()-1))));
        }
        
    }
    
}
