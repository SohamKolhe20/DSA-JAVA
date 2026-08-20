package String.Medium;

public class StringCompression {
    static int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            // count duplicate characters
            while (readIndex < chars.length && currentChar == chars[readIndex]) {
                readIndex++;
                count++;
            }

            // Now we have current character and its count

            chars[writeIndex] = currentChar;
            writeIndex++;

            // Now insert the count

            if (count > 1) {
                String countSt = String.valueOf(count);
                for (char digit : countSt.toCharArray()) {
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        char[] chars  = {'a','a','b','b','b','c','c','c','c','c','d'};
        System.out.println(compress(chars));
    }
}
