package Arrays;

public class PrefixSum {

    public int[] prefixSum(int[] arr) {
        int [] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {

    }
}
