/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vector;

import java.util.ArrayList;

/**
 *
 * @author BM
 */
public class Vec {
    public ArrayList Vec(){
        ArrayList array = new ArrayList();
        return array;
    }
    
    public ArrayList Vec(int[] val){
        ArrayList array = new ArrayList();
        for (int i = 0; i < val.length; i++) {
            array.add(val[i]);
        }
        return array;
    }
    
   
   
}
