package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hw0026 {


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] ch = br.readLine().toCharArray();
            String[] strs = new String[26];
            int index = 0;
            for (char c : ch) {
                if (c >= 'a' && c <= 'z') {
                    strs[c - 'a'] = strs[c - 'a'] != null ? strs[c - 'a'] + c : c + "";
                } else if (c >= 'A' && c <= 'Z') {
                    strs[c - 'A'] = strs[c - 'A'] != null ? strs[c - 'A'] + c : c + "";
                }
                index++;
            }
            StringBuilder sb = new StringBuilder();
            for (String s : strs) {
                if (s != null) {
                    sb.append(s);
                }
            }
            StringBuilder sb1 = new StringBuilder();
            char[] ch1 = sb.toString().toCharArray();
            index = 0;
            for (char c : ch) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    sb1.append(ch1[index]);
                    index++;
                } else {
                    sb1.append(c);
                }

            }
            System.out.println(sb1.toString());
        }
}
