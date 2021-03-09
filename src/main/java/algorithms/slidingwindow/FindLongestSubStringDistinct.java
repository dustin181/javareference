package algorithms.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindLongestSubStringDistinct {

//    public static String findLongest(String str) {
//
//        int end = 0;
//        int begin = 0;
//
//        int CHAR_RANGE = 128;
//        boolean[] window = new boolean[CHAR_RANGE];
//
//        for(int low = 0, high = 0;high < str.length();high++){
//
//            if (window[str.charAt(high)]){
//                while (str.charAt(low) != str.charAt(high)) {
//                    window[str.charAt(low)] = false;
//                    low++;
//                }
//
//                low++;
//            } else
//            {
//                window[str.charAt(high)] = true;
//
//                if (end - begin < high - low)
//                {
//                    begin = low;
//                    end = high;
//                };
//            }
//
//        }
//
//        return str.substring(begin, end + 1);
//    }

    //almost optimal using set
//    public static int findLongest(String str) {
//
//        int n = str.length(); //n equals length of string
//        Set<Character> currentWindow = new HashSet<>(); //initialize window as set
//        int longest = 0, left = 0, right = 0; //initialize current longest, left pointer, right pointer
//
//        while (left < n && right < n) {
//            if (!currentWindow.contains(str.charAt(right))){ //if character at right pointer not in current window,
//                currentWindow.add(str.charAt(right++));//add character to window
//                longest = Math.max(longest, right - left); //find max of current longest versus right pointer - left pointer
//            }
//            else {
//                currentWindow.remove(str.charAt(left++)); //else remove character at left pointer
//            }
//        }
//
//        return longest;
//
//    }

    public static int findLongest(String s) {

        //get length
        //set left and right pointer
        //increment left and right until end of string
        //add character to set if not already
        //right++
        //else remove character from set and move left pointer to right pointer

        int n = s.length();
        int left = 0;
        int right = 0;

        int ans = 0;

        Set<Character> window = new HashSet<>();

        while(left < n && right < n){

            if(!window.contains(s.charAt(right))){
                window.add(s.charAt(right++));
                ans = Math.max(ans, right - left);
            } else {
                window.remove(s.charAt(left++));
            }
        }

        return ans;
    }
}
