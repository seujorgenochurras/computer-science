package io.github.seujorgenochurras.sort;

import java.util.Arrays;

import static io.github.seujorgenochurras.sort.SortUtils.swapIndexesOfArray;

public class BubbleSort {
   public static void main(String[] args) {
      int[] messyArray = SortUtils.generateRandomIntArr(100000);
      System.out.println("Sorted Arr: " + Arrays.toString(bubbleSort(messyArray)));

   }
  public static int[] bubbleSort(int[] arrayToSort){
      for(int i = 1; i < arrayToSort.length; i++){
         for(int j = 0; j < arrayToSort.length-1; j++){
            if(arrayToSort[j] > arrayToSort[j + 1]){
               swapIndexesOfArray(arrayToSort, j, j + 1);
            }
         }
      }
      return arrayToSort;
  }

}
