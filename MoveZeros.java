
public class MoveZeros {
    
    public void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    nums [j] =nums[i];
                    j++;
                }                                 
            }
                        //    time complexity = O(n), Space complexity = O(1)
            for( ; j < nums.length; j++) {
                nums[j] = 0;
            }
        }
    }
    public static void main(String[] args) {

}
