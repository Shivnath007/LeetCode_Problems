
import java.util.HashSet;

public class InsertionOfTwoArray {

    public int[] insertionOfTwoArray(int nums1[], int nums2[]) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1) {
            set.add(num);
        }

        for(int num2 : nums2) {
            if(set.contains(num2)) {
                result.add(num2);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {

    }
}
