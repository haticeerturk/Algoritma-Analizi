/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diziyeelemanatama;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BM
 */
public class ArrayClass {
    List<int[]> arrayList = new ArrayList<int[]>();
    
    /* addValue fonksiyonunun karmaşıklığı O(1) dir. */
    public void addValue(int[] a){
        arrayList.add(a);
    }
    
    
    /* writeValueOfList fonksiyonunu karmaşıklığı O(n^2) dir. */
    public void writeValueOfList(){
        for (int i = 0; i < arrayList.size(); i++) {
            int[] dizi = new int[arrayList.get(i).length];
            for (int j = 0; j < arrayList.get(i).length; j++) {
                dizi = arrayList.get(i);
            }
            System.out.println("Liste içerisindeki dizi:");
            for (int j = 0; j < dizi.length; j++) {
                System.out.println(dizi[j]);
            }
        }
    }
}
