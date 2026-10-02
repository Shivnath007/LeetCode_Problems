
import java.util.HashMap;

//LeetCode Problem of twoSum
public class twoSum {
    public static void main(String [] args) {
        int nums[] = {1,2,5,4,9};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                System.out.println(map.get(diff));
                System.out.println(i);
            }
            map.put(nums[i], i);
        }
    }
}
