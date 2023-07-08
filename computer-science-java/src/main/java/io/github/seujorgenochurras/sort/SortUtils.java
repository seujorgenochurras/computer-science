package io.github.seujorgenochurras.sort;

import java.util.Random;

public class SortUtils {
   private static final Random random = new Random();

   private SortUtils(){}

   public static int[] generateRandomIntArr(int arraySize){
      int[] randomArray = new int[arraySize];
      for(int i = 0; i < arraySize-1; i++){
         randomArray[i] = (random.nextInt());
      }
      return randomArray;
   }

   public static int[] swapIndexesOfArray(int[] yourArray, int indexA, int indexB){
      int numberAtIndexA = yourArray[indexA];
      yourArray[indexA] = yourArray[indexB];
      yourArray[indexB] = numberAtIndexA;
      return yourArray;
   }

}
