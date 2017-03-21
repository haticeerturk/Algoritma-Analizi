/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.selection.insertion.quicksort;

import java.util.Random;

/**
 *
 * @author hatice
 */
public class BubbleSelectionInsertionQuickSort {
    static BubbleSort bubble = new BubbleSort();
    static SelectionSort selection = new SelectionSort();
    static InsertionSort insertion = new InsertionSort();
    static QuickSort quick = new QuickSort();
    
    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        
        int dizi[] = new int[1000];
        
        for (int i = 0; i < 1000; i++) {
           Random rand = new Random();

           int eleman = rand.nextInt(1000) + 1; 
           dizi[i] = eleman;
        }
        
        bubble.bubbleSort(dizi);
        //selection.selectionSort(dizi);
        //insertion.insertionSort(dizi);
        //quick.quickSort(dizi, 0, dizi.length - 1);
        
        long last = System.currentTimeMillis();
        
        System.out.println("Dizinin Sıralanmış Hali");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
        
        System.out.println("Çalışma Süresi(milisaniye): "+(last-first));
    }
    
}
