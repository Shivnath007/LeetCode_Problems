public class SingleNumber {

    public int singleNumber(int[] num) {

        int res = 0;

        for(int i = 0; i < num.length; i++) {
            res = num[i] ^ res;
        }
        return res;
    }
    
    public static void main(String[] args) {


    }
}
