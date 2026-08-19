package String;

public class PermutationInString {
    static boolean compFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }

        }
        return true;
    }

    static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency table of s1
        int[] count1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        // Frequency table of first window of s2
        int i = 0;
        int windowLength = s1.length();
        int[] count2 = new int[26];
        for (i = 0; i < windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        //compare both count1 and count2
        if (compFreq(count1, count2) == true) {
            return true;
        } else {
            //move the window to next character
            while (i < s2.length()) {

                // add new character
                char newChar = s2.charAt(i);
                int indexofNew = newChar - 'a';
                count2[indexofNew]++;

                //remove old character
                int oldCharIndex = i - windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                int FreqIndexofOldChar = oldChar - 'a';
                count2[FreqIndexofOldChar]--;

                if (compFreq(count1, count2) == true) {
                    return true;
                }
                i++;


            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s2 = "abcmadbca";
        String s1 = "mad";
        System.out.println("Is there any permutation of String 1 in String true = " + checkInclusion(s1, s2));
    }
}
