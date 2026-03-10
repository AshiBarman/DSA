public class Slidingwindow {
    public static void main(String[] args) {
        int[] arr = {3 , 5, 7 ,8 , 17 , 1, 2};
        int k = 3; // Size of the sliding window

        System.out.println("Maximum values in each sliding window:");
        for (int i = 0; i <= arr.length - k; i++) {
            int max = findMax(arr, i, k);
            System.out.print(max + " ");
        }
    }

    private static int findMax(int[] arr, int start, int k) {
        int max = arr[start];
        for (int i = start + 1; i < start + k; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
