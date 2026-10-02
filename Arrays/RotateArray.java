package Arrays;

public class RotateArray {

    public int[] rotate(int[] nums, int k, int start, int end) {

        int n = nums.length;
        k = k % n;

        start = 0; 
        end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
         start = 0;
         end = k - 1;
         while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
         }
         start = k;
         end = n - 1;
         while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
         }
        return nums;
    }
}
