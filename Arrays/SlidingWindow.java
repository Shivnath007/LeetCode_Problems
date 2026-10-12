package Arrays;

public class SlidingWindow {
    
    public int slidingWindow(int[] arr, int k) {

        int previousSum = 0;
        for(int i = 0; i < k; i++) {
            previousSum += arr[i]; 
        }
        int maxSum = previousSum;
        for(int j = k; j < arr.length; j++) {
            previousSum = previousSum - arr[j - k] + arr[j];
            maxSum = Math.max(maxSum, previousSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

    }
}
