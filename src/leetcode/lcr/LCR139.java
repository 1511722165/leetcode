package leetcode.lcr;

public class LCR139 {

    public int[] trainingPlan(int[] actions) {
        int left = 0, right = actions.length - 1;
        while (left < right) {
            if (actions[left] % 2 == 1) {
                left++;
            } else {
                while (left < right&&actions[right] % 2 == 0) {
                    right--;
                }

                if (left < right) {
                    int temp = actions[left];
                    actions[left] = actions[right];
                    actions[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        return actions;
    }
}
