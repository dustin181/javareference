package algorithms.slidingwindow;

import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstringAtMostTwoDistinctChars {


    public static int findLongest(String s) {

        int n = s.length();

        if(n < 3){
            return s.length();
        }



        int left = 0;
        int right = 0;
        int maxLength = 2;

        Map<Character, Integer> window = new HashMap<>();

        while(right < n){

            window.put(s.charAt(right), right++);

            if(window.size() == 3){
                int del_idx = Collections.min(window.values());
                window.remove(s.charAt(del_idx));
                // move left pointer of the slidewindow
                left = del_idx + 1;
            }

            maxLength = Math.max(maxLength, right - left);
        }


        return maxLength;
    }
}
