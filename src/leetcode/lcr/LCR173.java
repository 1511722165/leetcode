package leetcode.lcr;

public class LCR173 {

    public int takeAttendance(int[] records) {
        int len = records.length;
        if (len == 1) {
            return records[0] == 0 ? 1 : 0;
        }
        int left = 0, right = len - 1;
        while (left < right) {
            if (records[left] != left) return left;
            if (records[right] == right) return right + 1;
            if (records[left] == left && records[left + 1] != left + 1) return left + 1;
            int mid = (left + right) / 2;
            if (records[mid] == mid) {
                left = mid;
            } else if (records[mid] > mid) {
                right = mid;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        LCR173 demo = new LCR173();
        demo.takeAttendance(new int[]{0, 1, 2, 3, 5});

    }
}
