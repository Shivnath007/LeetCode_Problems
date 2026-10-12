package Arrays;

public class ApplyOperations {
    
    public int[] applyOperations(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i + 1] * 2;
                nums[i + 1] = 0;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            index++;
        }
        return nums;
    }
}
