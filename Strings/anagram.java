package Strings;

public class anagram {

    public boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] fre = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            fre[s1.charAt(i) - 'a']++;
        }
        for (int j = 0; j < s2.length(); j++) {
            fre[s2.charAt(j) - 'a']--;
        }
        
        for(int count : fre) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
