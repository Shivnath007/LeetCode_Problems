package Arrays;

public class SuffixSum {

    public int[] suffixSum(int[] arr) {

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] += arr[i + 1];
        }
        return arr;
    }

    public static void main(String[] args) {
    }
}