package algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

//   //solution does not work for all cases
//    public static int findLongestSubstring(String input) {
//
//        if(input.length() <= 1){
//            return input.length();
//        }
//
//        int i = 0;
//        int j = 1;
//
//        int maxCount = 0;
//
//
//        while(i < input.length() - 2){
//            Character c1 = input.charAt(i);
//            Character c2 = input.charAt(i + 1);
//
//            if(c1 == c2) {
//                maxCount = 0;
//            }
//
//            maxCount++;
//            i++;
//            j++;
//        }
//
//        return maxCount;
//    }

    public static int findLongestSubstring(String input) {

        if (input.length() <= 1) {
            return input.length();
        }

        Map<Character, Integer> seenCharacters = new HashMap<>();

        int longest = 0;

        for(int left = 0, right = 0;right < input.length() - 1;right++){

            Character c = input.charAt(right);
            int previouslySeenChar = seenCharacters.getOrDefault(c,0);

            if(previouslySeenChar >= left){
                left = previouslySeenChar + 1;
            }

            seenCharacters.put(c, right);

            longest = Math.max(longest, right - left + 1);

        }

        return longest;
    }


}
