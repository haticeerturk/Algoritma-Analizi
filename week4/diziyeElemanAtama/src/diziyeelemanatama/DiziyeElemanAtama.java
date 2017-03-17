/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diziyeelemanatama;

/**
 *
 * @author BM
 */
public class DiziyeElemanAtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayClass array = new ArrayClass();
        ArrayClass array1 = new ArrayClass();
        
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*2;
        }
        /* İlk for döngüsünün karmaşıklığı O(n) dir. */
        
        int[] arr2 = new int[6];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i*3;
        }
        /* İkinci for döngüsünün karmaşıklığı O(n) dir. */
                
        array.addValue(arr);
        array.addValue(arr2);
        
        
        /* Java da nesne atama işleminin karmaşıklığı O(n) dir. */
        array1 = array;
        
        System.out.println("-------------------------------");
        System.out.println("array listesinin elemanları: ");
        System.out.println("-------------------------------");
        array.writeValueOfList();
        
        System.out.println("-------------------------------");
        System.out.println("array1 in elemanları");
        System.out.println("-------------------------------");
        array1.writeValueOfList();
        
        
        /* Yazılan bu kodun tamamının karmaşıklığı O(n^2) dir. */
    }
}
