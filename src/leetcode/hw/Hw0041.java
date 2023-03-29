package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0041 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            int n = Integer.parseInt(line);
            String[] s1 = reader.readLine().split(" ");
            String[] s2 = reader.readLine().split(" ");
            int[] weight = new int[n];
            int[] number = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i] = Integer.parseInt(s1[i]);
                number[i] = Integer.parseInt(s2[i]);
            }




        }
    }
}
