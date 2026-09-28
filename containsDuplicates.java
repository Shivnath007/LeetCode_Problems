
import java.util.HashMap;

public class containsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 5, 1, 6, 8, 7, 9, 4, 10 };

        if (containsDuplicate(arr)) {
            System.out.println("Contains duplicate.");
        } else {
            System.out.println("No duplicates.");
        }
    }
}
