/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dizisiralama;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BMB
 */
public class DiziSiralama {

    public static ArrayList<Integer> sol = new ArrayList<Integer>();
    public static ArrayList<Integer> sag = new ArrayList<Integer>();
    public static ArrayList<Integer> solSiralanmis = new ArrayList<Integer>();
    
    private static int maxSum(ArrayList<Integer> a){
        int maxSum = 0;
        
        for (int i = 0; i < a.size(); i++) {
            int thisSum = 0;
            for (int j = i; j < a.size(); j++) {
                thisSum = thisSum + a.get(j);
                if(thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
            return maxSum;
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
        ArrayList<Integer> dizi = new ArrayList<Integer>();
        dizi.add(4);
        dizi.add(-3);
        dizi.add(2);
        dizi.add(1);
        dizi.add(6);
        dizi.add(-1);
        dizi.add(-2);
        dizi.add(4);
        
        diziyiBol(dizi);
        System.out.println("Sol dizi: \n");
        for (int i = 0; i < sol.size(); i++) {
            System.out.println(sol.get(i));
        }
        
        System.out.println("Sağ dizi: \n");
        for (int i = 0; i < sol.size(); i++) {
            System.out.println(sag.get(i));
        }
        
        
        int solMaxSum = maxSum(sol);
        int sagMaxSum = maxSum(sag);
        
        int toplam = solMaxSum + sagMaxSum;
        
        System.out.println("Sol listenin max. toplamı: " + solMaxSum);
        System.out.println("Sağ listenin max. toplamı: " + sagMaxSum);
        
        System.out.println("İki listenin max. toplamlarının toplamı: "+toplam);
    }
}
