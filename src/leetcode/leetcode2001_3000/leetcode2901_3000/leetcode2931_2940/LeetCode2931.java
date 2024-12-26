package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2931_2940;

import java.util.Arrays;

public class LeetCode2931 {

    private static Nodes nodes = null;

    public long maxSpending(int[][] values) {
        int n = values[0].length;
        long res = 0l;
        for (int i = 0; i < values.length; i++) {
            if (nodes == null) {
                nodes = new Nodes();
                nodes.i = i;
                nodes.j = n - 1;
                nodes.value = values[i][n - 1];
            } else {
                Nodes node = new Nodes();
                node.i = i;
                node.j = n - 1;
                node.value = values[i][n - 1];
                nodes = this.sortNode(nodes, node);
            }

        }
        int i = 1;
        while (nodes != null) {
            res += i * nodes.value;
            if (nodes.j != 0) {
                Nodes node = new Nodes();
                node.i = nodes.i;
                node.j = nodes.j - 1;
                node.value = values[nodes.i][nodes.j - 1];
                nodes = this.sortNode(nodes.next, node);
            } else {
                nodes = nodes.next;
            }
            i++;
        }
        return res;
    }

    private Nodes sortNode(Nodes nodes, Nodes node) {
        if (nodes == null) return node;
        if (nodes.value > node.value) {
            node.next = nodes;
            return node;
        } else if (nodes.next == null) {
            nodes.next = node;
            return nodes;
        } else {
            nodes.next = sortNode(nodes.next, node);
            return nodes;
        }
    }


    public long maxSpending1(int[][] values) {
        int max=values.length*values[0].length;
        long[] arr=new long[max];
        int index=0;
        for (int i=0;i<values.length;i++){
            for (int j=0;j<values[0].length;j++){
                arr[index++]=values[i][j];
            }
        }
        Arrays.sort(arr);
        long res=0l;
        for (int i=max-1;i>=0;i--){
            res+=arr[i]*max;
            max--;
        }
        return res;
    }
}

class Nodes {
    Nodes next;
    int i;
    int j;
    long value;
    public Nodes() {
    }
}
