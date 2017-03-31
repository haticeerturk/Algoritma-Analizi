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
public class Vector {

    /**
     * @param args the command line arguments
     */
    
    public static void setitem(ArrayList array, int val, int where){
        array.add(where, val);
    }
    
    public static void getitem(ArrayList array, int where){
        array.get(where);
    }
    
    public static void print(ArrayList array){
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
    
    public void scalar_mul(ArrayList array, int val){
        
    }
    
    public static void main(String[] args) {
        Vec vector = new Vec();
        ArrayList array = vector.Vec();
        
        int[] val = {5,4,3};
        ArrayList newArray = vector.Vec(val);
        
        setitem(array, 5, 3);
        setitem(array, 15, 4);
        
        //vector.print(array);
        print(newArray);
    }
    
}
