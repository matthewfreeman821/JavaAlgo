public class SelectionSort {
  public static void selectionSort(Object[] array, int fromIndex, int toIndex) {
    Object d;
    for (int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) {
      int indexToMove = currentIndex;
      for (int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < toIndex; tempIndexInLoop++) {
        if (((Comparable) array[indexToMove]).compareTo(array[tempIndexInLoop]) > 0) {
          indexToMove = tempIndexInLoop;
        }
      }
      d = array[currentIndex];
      array[currentIndex] = array[indexToMove];
      array[indexToMove] = d;
    }
  }
}