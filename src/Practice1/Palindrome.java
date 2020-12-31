package Practice1;

import java.util.Locale;
// почитать про regexp, чтобы понять replaceAll
public class Palindrome {
    public boolean isPalindrome(String word) {
        word = word.toLowerCase(Locale.ROOT);
        word = word.replaceAll("(\\s)|(!)|(\\.)|(\\?)|(\")|(,)|(:)|(;)|(')", "");
        int wordIndexStart = 0;
        int wordIndexEnd = word.length()-1;
        while (wordIndexEnd > wordIndexStart) {
            if (word.charAt(wordIndexStart) != word.charAt(wordIndexEnd)) {
                return false;
            }
            ++wordIndexStart;
            --wordIndexEnd;
        }
        return true;
    }
}
