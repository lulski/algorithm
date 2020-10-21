public class BinarySearch {
  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      System.out.println("searching ..");

      int mid = lo + (hi - lo) / 2;
      if (key < a[mid])
        hi = mid - 1;
      else if (key > a[mid])
        hi = mid + 1;
      else
        return mid;
    }

    return -1;
  }
}
