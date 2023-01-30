
public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlaceFixed(int[] arr) {
    for (int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  // Changes the input array to be in reversed order
  static void reverseInPlaceOriginal(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
}
