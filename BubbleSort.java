public class BubbleSort {
  public static void bubbleSort(Object[] array, int fromIndex, int toIndex) {
    Object d;
    for (int i = toIndex - 1; i > fromIndex; i--) {
      boolean isSorted = true;
      for (int j = fromIndex; j < i; j++) {
        if (((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
          isSorted = false;
          d = array[j + 1];
          array[j + 1] = array[j];
          array[j] = d;
        }
      }
      if (isSorted) {
        break;
      }
    }
  }
}