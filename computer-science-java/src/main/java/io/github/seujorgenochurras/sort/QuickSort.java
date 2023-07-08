package io.github.seujorgenochurras.sort;

import java.util.Arrays;

public class QuickSort {
   public static void main(String[] args) {
      int[] messyArr = SortUtils.generateRandomIntArr(1000000);
      quickSort(messyArr, 0, 999999);
      System.out.println(Arrays.toString(messyArr));
   }

   private static void quickSort(int[] messyArr, int leftPointer, int rightPointer) {
      if (leftPointer < rightPointer) {
         int partitionIndex = partition(messyArr, leftPointer, rightPointer);

         quickSort(messyArr, leftPointer, partitionIndex-1);
         quickSort(messyArr, partitionIndex+1, rightPointer);
      }
   }

   private static int partition(int[] arr, int begin, int end) {int pivot = arr[end];
      int i = begin-1;

      for (int j = begin; j < end; j++) {
         if (arr[j] < pivot) {
            i++;
            SortUtils.swapIndexesOfArray(arr, i, j);
         }
      }

      SortUtils.swapIndexesOfArray(arr, i+1, end);
      return i+1;
   }
}
