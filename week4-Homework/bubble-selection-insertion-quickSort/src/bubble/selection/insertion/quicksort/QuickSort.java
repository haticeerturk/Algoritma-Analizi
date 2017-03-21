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
public class QuickSort {
    public void quickSort(int dizi[], int ilk, int son){
        if(ilk < son){
            int pIndex = quickPartition(dizi, ilk, son);
            quickSort(dizi, ilk, pIndex - 1);
            quickSort(dizi, pIndex+1, son);
        }
        else    return;
    }
    public int quickPartition(int dizi[],int ilk, int son){
        int temp;
        int pivot = dizi[son];
        int pIndex = ilk;

        for(int i = ilk; i < son; i++){
            if(dizi[i] <= pivot){
                temp = dizi[i];
                dizi[i] = dizi[pIndex];
                dizi[pIndex] = temp;
                pIndex++;
            }
        }
        
        temp = dizi[pIndex];
        dizi[pIndex] = dizi[son];
        dizi[son] = temp;
        return pIndex;
    }
}
