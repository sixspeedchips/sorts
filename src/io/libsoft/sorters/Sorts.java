package io.libsoft.sorters;

import java.util.List;
import java.util.Random;

public class Sorts {

  private static Random random = new Random();
  // toy class implementing various sorts based on Effective java
  // chapter 5: "favor generic methods"

  public static <E extends Comparable<E>> List<E> insertionSort(List<E> unsorted) {
    for (int i = 0; i < unsorted.size() - 1; i++) {
      int j = i+1;
      while (--j >= 0 && unsorted.get(j).compareTo(unsorted.get(j + 1)) >= 0) {
        swap(unsorted, j, j + 1);
      }
    }
    return unsorted;
  }

  public static <E extends Comparable<E>> List<E> quickSort(List<E> list, int low, int high){
    if(low < high){
      int pivot = partition(list,low,high);
      quickSort(list, low, pivot);
      quickSort(list, pivot+1, high);
    }
    return list;
  }

  private static <E extends Comparable<E>> int partition(List<E> list, int low, int high) {
    E pivot = list.get(low + random.nextInt(high-low));

    int i = low - 1;
    int j = high + 1;
    while (true){
      while (list.get(++i).compareTo(pivot) < 0){
      }
      while (list.get(--j).compareTo(pivot) > 0){
      }
      if(i>=j){
        return j;
      }
      swap(list,i,j);


    }

  }


  private static <E extends Comparable<E>> void swap(List<E> list, int j, int k) {
    E temp = list.get(j);
    list.set(j, list.get(k));
    list.set(k, temp);
  }
}
