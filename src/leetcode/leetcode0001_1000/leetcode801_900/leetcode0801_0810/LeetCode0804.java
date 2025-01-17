package leetcode.leetcode0001_1000.leetcode801_900.leetcode0801_0810;

import java.util.HashSet;

public class LeetCode0804 {

    public static String[] Ms=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set =new HashSet();
        for (String word:words){
            StringBuilder sb=new StringBuilder();
            for (char c:word.toCharArray()){
                sb.append(Ms[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
