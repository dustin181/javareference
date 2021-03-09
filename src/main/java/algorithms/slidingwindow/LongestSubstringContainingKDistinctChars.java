package algorithms.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringContainingKDistinctChars {
    public static String findLongest(String str, int k) {

        int CHAR_RANGE = 128;

        int left = 0;
        int right = 0;

        Set<Character> window = new HashSet<>();

        int[] freq = new int[CHAR_RANGE];

        for (int low = 0, high = 0; high < str.length(); high++){
            window.add(str.charAt(high));
            freq[str.charAt(high)]++;

            // if window size is more than k, remove characters from the left
            while (window.size() > k)
            {
                // if the frequency of leftmost character becomes 0 after
                // removing it in the window, remove it from set as well
                if (--freq[str.charAt(low)] == 0) {
                    window.remove(str.charAt(low));
                }

                low++;        // reduce window size
            }

            // update maximum window size if necessary
            if (right - left < high - low)
            {
                right = high;
                left = low;
            }
        }

        return str.substring(left, right + 1);

    }
}
