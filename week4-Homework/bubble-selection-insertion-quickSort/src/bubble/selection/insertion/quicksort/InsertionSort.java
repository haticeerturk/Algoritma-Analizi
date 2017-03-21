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
public class InsertionSort {
    public void insertionSort(int[] dizi){
        for (int i = 1; i < dizi.length; i++) {
            int temp = dizi[i];
            int j = i - 1;
            
            while(j > -1 && dizi[j] > temp){
                dizi[j+1] = dizi[j];
                j--;
            }
            dizi[j+1] = temp;
        }
    }
}
