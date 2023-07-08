package io.github.seujorgenochurras.sort;

import java.util.Arrays;
import static io.github.seujorgenochurras.sort.SortUtils.*;

public class Selection {
   public static void main(String[] args) {
      int[] messyArray = SortUtils.generateRandomIntArr(100000);
      System.out.println("Sorted Arr: " + Arrays.toString(selectionSort(messyArray)));

   }
   public static int[] selectionSort(int[] messyArray){
      for(int i = 0; i < messyArray.length-1; i++){
        int indexOfSmallestNum = i;
        for(int j = i+1; j<messyArray.length; j++){
           if(messyArray[j] < messyArray[indexOfSmallestNum]) {
              indexOfSmallestNum = j;
           }
        }
        if(indexOfSmallestNum != i) {
           swapIndexesOfArray(messyArray, i, indexOfSmallestNum);
        }
      }
      return messyArray;
   }
}
