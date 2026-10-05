package Arrays;

public class ProductOfArrayExceptSelf {
    
    public int[] productExceptSelf(int [] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int[] answer = new int[nums.length];
        // prefixProduct logic
        for(int i  = 0; i < nums.length; i++) {
            int current = nums[i];
            answer[i] = leftProduct;
            leftProduct *= current;
        }
        // suffixProduct logic
        for(int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
