package io.libsoft.sorters;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class SortsTest {

  private static Random random = new Random();

  @Test
  void insertionSort() {
    System.out.println(Sorts.insertionSort(randomList(10,20)));
  }

  @Test
  void quickSort() {
    System.out.println(Sorts.quickSort(randomList(10, 20), 0, 9));
  }


  private static List<Integer> randomList(int num, int bound){
    List<Integer> integerList = IntStream.generate(() -> random.nextInt(bound)).
        limit(num).boxed().collect(Collectors.toList());

    System.out.println(integerList);
    return integerList;
  }
}