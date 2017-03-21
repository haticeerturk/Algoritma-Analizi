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
public class SelectionSort {
    public void selectionSort(int[] dizi){
        for (int i = 0; i < dizi.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if(dizi[j] < dizi[index]){
                    index = j;
                }
            }
            int kucukDeger = dizi[index];
            dizi[index] = dizi[i];
            dizi[i] = kucukDeger;
        }
    }
}
