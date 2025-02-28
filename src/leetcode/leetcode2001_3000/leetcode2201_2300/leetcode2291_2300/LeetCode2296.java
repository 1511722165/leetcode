package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2291_2300;

public class LeetCode2296 {

    int left;
    int right;
    StringBuilder sl;
    StringBuilder sr;
    int index;

    public LeetCode2296() {
        sl = new StringBuilder();
        sr = new StringBuilder();
        left = right = index = 0;
    }

    public void addText(String text) {
        if (index >= 0) {
            sr.insert(index, text);
            right += text.length();
            index += text.length();
        } else {
            sl.insert(left + index, text);
            left += text.length();
            index += text.length();
        }
    }

    public int deleteText(int k) {

        //右侧移动k
        if (index >= k) {
            sr.replace(index - k, index, "");
            right -= k;
            index -= k;
            return k;
        } else if (index > 0) {

            //右侧移动index
            sr.replace(0, index, "");
            right -= index;
            //左侧移动 k-index 需要判断k-index 是否大于left
            if (k - index > left) {
                int len = index;
                //左侧清空
                len += left;
                sl = new StringBuilder("");
                left = index = 0;
                return len;
            } else {
                sl.replace(left + index - k, left, "");
                left -= (k - index);
                index = 0;
                return k;
            }

        } else {
            //左侧移动
            if (left + index >= k) {
                sl.replace(left + index - k, left + index, "");
                return k;
            } else {
                int len = left + index;
                sl.replace(0, left + index, "");
                left += index;
                index = -left;
                return len;
            }
        }
    }

    public String cursorLeft(int k) {
        //确定index位置
        if (left + index >= k) {
            index -= k;
        } else {
            index = -left;
        }
        //确定长度
        if (left + index >= 10) {
            //10个长度 右侧取10
            if (index >= 10) {
                return sr.substring(index - 10, index);
            } else if (index >= 0) {
                return sl.substring(left + index - 10) + sr.substring(0, index);
            } else {
                return sl.substring(left + index - 10, left + index);
            }

        } else {
            //只有光标左侧
            if (index > 0) {
                return sl.toString() + sr.substring(0, index);
            } else {
                return sl.substring(0, left + index);
            }

        }


    }

    public String cursorRight(int k) {
        //确定index位置
        if (right - index >= k) {
            index += k;
        } else {
            index = right;
        }
        //确定长度
        if (left + index >= 10) {
            //10个长度 右侧取10
            if (index >= 10) {
                return sr.substring(index - 10, index);
            } else if (index >= 0) {
                return sl.substring(left + index - 10) + sr.substring(0, index);
            } else {
                return sl.substring(left + index - 10, left + index);
            }

        } else {
            //只有光标左侧
            if (index > 0) {
                return sl.toString() + sr.substring(0, index);
            } else {
                return sl.substring(0, left + index);
            }

        }
    }


    public static void main(String[] args) {
        LeetCode2296 demo = new LeetCode2296();
        demo.addText("leetcode");
        demo.deleteText(4);
        demo.addText("practice");
        demo.cursorRight(3);
        demo.cursorLeft(8);
        demo.deleteText(10);
        demo.cursorLeft(2);
        demo.cursorRight(6);
    }
}
