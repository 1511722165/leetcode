package leetcode.lcr;

import java.util.Arrays;

public class LCR158 {

    public int inventoryManagement(int[] stock) {
        Arrays.sort(stock);
        return stock[stock.length/2];
    }
}
