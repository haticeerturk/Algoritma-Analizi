/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.selection.insertion.quicksort;

/**
 *
 * @author hatice
 */
public class BubbleSort {
    public void bubbleSort(int[] dizi){
        int temp = 0;
        
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length - i; j++) {
                if(dizi[j-1] > dizi[j]){
                    temp = dizi[j-1];
                    dizi[j-1] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
    }
}
