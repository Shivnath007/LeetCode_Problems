package Arrays;

public class TwoPointer {

    public boolean twoPointer(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        // This works for sorted arrays, iof the array is unsorted it will not gaurantee the correct answer
        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
