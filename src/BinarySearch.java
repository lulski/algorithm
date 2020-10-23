public class BinarySearch {
  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {

      int mid = lo + (hi - lo) / 2;
      System.out.println("searching: " + key + ", lo: " + lo + " hi: " + hi + ", mid: " + mid + ", a[mid]:" + a[mid]);
      if (key < a[mid])
        hi = mid - 1;
      else if (key > a[mid])
        lo = mid + 1;
      else
        return mid;
    }

    return -1;
  }
}
