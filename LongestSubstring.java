//Given a string, find the length of the longest substring without repeating characters.
//
//        Example 1:
//
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
import java.util.Hashtable;

public class LongestSubstring {
    public int solution(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();
        int length = 0, maxLength = 0, previousIndex;
        char letter;
        for (int start = 0, current = 0; current < s.length(); current++) {
            letter = s.charAt(current);
            if (table.containsKey(letter)) {
                previousIndex = table.get(letter);
                if (previousIndex >= start) {
                    start = previousIndex + 1;
                }
                length = current - start + 1;
                table.replace(letter, current);
            } else {
                table.put(letter, current);
                length++;
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
