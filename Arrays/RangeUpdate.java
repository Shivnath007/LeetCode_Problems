package Arrays;

public class RangeUpdate {
    public int[] rangeUpdate(int n, int[][] updates) {
        int[] diff = new int[n];
        for(int i = 0; i < updates.length; i++) {
            int start = updates[i][0];
            int end = updates[i][1];
            int inc = updates[i][2];
            diff[start] += inc;
            if(end + 1 < n) {
                diff[end + 1] -= inc;
            }
        }
        for(int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        return diff;
    }
}
