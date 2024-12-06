package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0017 {


    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        char[] cs = digits.toCharArray();

        List<String> list = new ArrayList<String>();
        dfs(cs, 0, "", list);
        return list;
    }

    private void dfs(char[] cs, int n, String sb, List<String> list) {
        char c = cs[n];

        switch (c) {
            case '2':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'a', list);
                    dfs(cs, n, sb + 'b', list);
                    dfs(cs, n, sb + 'c', list);
                } else {
                    list.add(sb + 'a');
                    list.add(sb + 'b');
                    list.add(sb + 'c');
                }
                break;
            case '3':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'd', list);
                    dfs(cs, n, sb + 'e', list);
                    dfs(cs, n, sb + 'f', list);
                } else {
                    list.add(sb + 'd');
                    list.add(sb + 'e');
                    list.add(sb + 'f');
                }
                break;
            case '4':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'g', list);
                    dfs(cs, n, sb + 'h', list);
                    dfs(cs, n, sb + 'i', list);
                } else {
                    list.add(sb + 'g');
                    list.add(sb + 'h');
                    list.add(sb + 'i');
                }
                break;
            case '5':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'j', list);
                    dfs(cs, n, sb + 'k', list);
                    dfs(cs, n, sb + 'l', list);
                } else {
                    list.add(sb + 'j');
                    list.add(sb + 'k');
                    list.add(sb + 'l');
                }
                break;
            case '6':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'm', list);
                    dfs(cs, n, sb + 'n', list);
                    dfs(cs, n, sb + 'o', list);
                } else {
                    list.add(sb + 'm');
                    list.add(sb + 'n');
                    list.add(sb + 'o');
                }
                break;
            case '7':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'p', list);
                    dfs(cs, n, sb + 'q', list);
                    dfs(cs, n, sb + 'r', list);
                    dfs(cs, n, sb + 's', list);
                } else {
                    list.add(sb + 'p');
                    list.add(sb + 'q');
                    list.add(sb + 'r');
                    list.add(sb + 's');
                }
                break;
            case '8':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 't', list);
                    dfs(cs, n, sb + 'u', list);
                    dfs(cs, n, sb + 'v', list);
                } else {
                    list.add(sb + 't');
                    list.add(sb + 'u');
                    list.add(sb + 'v');
                }
                break;
            case '9':
                if (n < cs.length - 1) {
                    n++;
                    dfs(cs, n, sb + 'w', list);
                    dfs(cs, n, sb + 'x', list);
                    dfs(cs, n, sb + 'y', list);
                    dfs(cs, n, sb + 'z', list);
                } else {
                    list.add(sb + 'w');
                    list.add(sb + 'x');
                    list.add(sb + 'y');
                    list.add(sb + 'z');
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        LeetCode0017 leetCode0017 = new LeetCode0017();
        leetCode0017.letterCombinations("23");
    }

}
