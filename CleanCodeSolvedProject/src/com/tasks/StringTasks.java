package com.tasks;

import java.util.*;

/**
 * Given a string s, find the length of the longest substring with unique characters
 * (there should not be any character that appears in the string twice or more).
 * The substring should be a solid substring (continuous sequence of characters presenting in s),
 * not just a subsequence or set of characters from s.
 *
 * Example 1: Input: s = "abca" Output: 3 Longest substring: “abc”
 * Example 2: Input: s = "abcabcbb" Output: 3 Longest substring: “abc”
 * Example 3: Input: s = "bbbbb"Output: 1 Longest substring: “b”
 * Example 4: Input: s = "pwwkew" Output: 3 Longest substring: “wke”
 * */
public class StringTasks {

    public static void main(String[] args) {
       System.out.println("Result "+lengthOfLongestSubstring("abcdfgabcijkl"));
       cleanSet();
       /*System.out.println("Result "+lengthOfLongestSubstring("abcdfgabc"));
       cleanSet();
       System.out.println("Result "+lengthOfLongestSubstring("abcabcdfg"));
       cleanSet();
       System.out.println("Result "+lengthOfLongestSubstring("abca"));
       cleanSet();
       System.out.println("Result "+lengthOfLongestSubstring("abcabcbb"));
       cleanSet();
       System.out.println("Result "+lengthOfLongestSubstring("bbbbbbb"));
       cleanSet();
       System.out.println("Result "+lengthOfLongestSubstring("pwwkew"));
       cleanSet();*/
    }

    static Set<String> set = new HashSet();

    public static int lengthOfLongestSubstring(String text) {
        System.out.println("BEGIN: "+text);
        if(Objects.isNull(text) || text.isEmpty()){
            return 0;
        }
        //read the text as an array
        StringBuilder subString = new StringBuilder();
        subString.append(text.substring(0,1));
        char[] charArray = text.substring(1).toCharArray();
        int count = 0;
        for (char letter: charArray) {
            if(subString.toString().contains(String.valueOf(letter))) {
                set.add(subString.toString());
                subString = subString.delete(0, subString.length());
                subString.append(letter);
                count+=subString.length();
            }else {
                subString.append(letter);
                String temp = text.substring(count + subString.length());
                if(temp.startsWith(subString.toString())) {
                    set.add(subString.toString());
                    return lengthOfLongestSubstring(temp);
                }
            }
        }
        set.add(subString.toString());

        System.out.println(set);

        Optional<Integer> max = set.stream().map(s -> Integer.valueOf(s.length())).max((i,j)-> i.compareTo(j));

        if(max.isPresent()) {
            return max.get();
        }
        return 0;
    }

    protected static void cleanSet(){
        set.clear();
    }

}
