package io.github.seujorgenochurras.sort;

import java.util.Arrays;

import static io.github.seujorgenochurras.sort.SortUtils.*;

public class Insertion {
   public static void main(String[] args) {
      System.out.println(Arrays.toString(insertionSort(generateRandomIntArr(100000))));
   }
   public static int[] insertionSort(int[] messyArray){
      for(int i = 1; i < messyArray.length; i++){
         int j = i;
         while(j > 0 && messyArray[j-1] > messyArray[j]){
            swapIndexesOfArray(messyArray, j, j-1);
            j--;
         }
      }
      return messyArray;
   }

}
