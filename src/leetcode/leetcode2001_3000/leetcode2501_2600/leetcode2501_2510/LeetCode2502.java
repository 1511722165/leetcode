package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2501_2510;

public class LeetCode2502 {

    int[] memory;
    int min;
    int n;

    public LeetCode2502(int n) {
        this.n = n;
        memory = new int[n];
        min = 0;
        for (int i = 0; i < n; i++) {
            memory[i] = -n;
            n--;
        }
    }

    public int allocate(int size, int mID) {
        int index = min;
        while (index < n) {
            if (memory[index] > 0) {
                index++;
            } else if (Math.abs(memory[index]) < size) {
                index += Math.abs(memory[index]);
            } else {
                for (int i = 0; i < size; i++) {
                    memory[i + index] = mID;
                }
                if (index == min) min = index + size;
                return index;
            }
        }
        return -1;
    }

    public int freeMemory(int mID) {
        int count = 0;
        if (memory[n - 1] == mID) {
            count++;
            min = Math.min(min, n - 1);
            memory[n - 1] = -1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (memory[i] == mID) {
                min = Math.min(min, i);
                if (memory[i + 1] > 0) {
                    memory[i] = -1;
                } else {
                    memory[i] = memory[i + 1] - 1;
                }
                count++;
            } else if (memory[i] < 0 && memory[i + 1] < 0) {
                memory[i] = memory[i + 1] - 1;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode2502 demo = new LeetCode2502(100);
        System.out.println(demo.freeMemory(27));
        System.out.println(demo.freeMemory(12));
        System.out.println(demo.freeMemory(53));
        System.out.println(demo.freeMemory(61));
        System.out.println(demo.freeMemory(80));
        System.out.println(demo.allocate(21, 78));
        System.out.println(demo.allocate(81, 40));
        System.out.println(demo.allocate(50, 76));
        System.out.println(demo.freeMemory(40));
        System.out.println(demo.freeMemory(76));
        System.out.println(demo.freeMemory(63));
        System.out.println(demo.allocate(25, 100));
        System.out.println(demo.allocate(96, 12));
        System.out.println(demo.freeMemory(92));
        System.out.println(demo.freeMemory(92));
        System.out.println(demo.freeMemory(84));
        System.out.println(demo.allocate(19, 71));
        System.out.println(demo.allocate(22, 90));
        System.out.println(demo.freeMemory(60));
        System.out.println(demo.allocate(42, 79));
        System.out.println(demo.allocate(26, 41));
        System.out.println(demo.allocate(59, 33));
        System.out.println(demo.freeMemory(79));
        System.out.println(demo.freeMemory(58));
        System.out.println(demo.freeMemory(97));
        System.out.println(demo.freeMemory(92));
        System.out.println(demo.freeMemory(97));
        System.out.println(demo.freeMemory(92));
        System.out.println(demo.freeMemory(40));
        System.out.println(demo.allocate(52, 74));
        System.out.println(demo.freeMemory(40));
        System.out.println(demo.allocate(53, 17));
        System.out.println(demo.freeMemory(17));
        System.out.println(demo.allocate(36, 32));
        System.out.println(demo.allocate(51, 13));
        System.out.println(demo.freeMemory(41));
        System.out.println(demo.allocate(5, 87));
        System.out.println(demo.allocate(44, 66));
        System.out.println(demo.freeMemory(71));
        System.out.println(demo.freeMemory(53));
        System.out.println(demo.allocate(74, 14));
        System.out.println(demo.freeMemory(78));
        System.out.println(demo.freeMemory(14));
        System.out.println(demo.allocate(32, 54));
        System.out.println(demo.allocate(45, 28));
        System.out.println(demo.allocate(84, 47));
        System.out.println(demo.freeMemory(16));
        System.out.println(demo.allocate(100, 78));
        System.out.println(demo.allocate(5, 99));
        System.out.println(demo.freeMemory(33));
        System.out.println(demo.freeMemory(100));
        System.out.println(demo.allocate(62, 79));
        System.out.println(demo.allocate(31, 32));
        System.out.println(demo.allocate(85, 81));
        System.out.println(demo.freeMemory(78));
        System.out.println(demo.allocate(34, 45));
        System.out.println(demo.allocate(47, 7));
        System.out.println(demo.freeMemory(7));
        System.out.println(demo.freeMemory(84));
        System.out.println(demo.freeMemory(6));
        System.out.println(demo.allocate(35, 55));
        System.out.println(demo.freeMemory(94));
        System.out.println(demo.freeMemory(87));
        System.out.println(demo.freeMemory(20));
        System.out.println(demo.freeMemory(87));
        System.out.println(demo.allocate(96, 60));
        System.out.println(demo.allocate(40, 66));
        System.out.println(demo.allocate(28, 96));
        System.out.println(demo.freeMemory(28));
        System.out.println(demo.allocate(25, 2));
        System.out.println(demo.freeMemory(100));
        System.out.println(demo.freeMemory(96));
        System.out.println(demo.allocate(19, 35));
        System.out.println(demo.freeMemory(16));
        System.out.println(demo.allocate(92, 42));
        System.out.println(demo.freeMemory(80));
        System.out.println(demo.freeMemory(79));
    }
}
