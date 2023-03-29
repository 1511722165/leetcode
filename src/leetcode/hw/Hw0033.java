package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0033 {

    public static void main(String[] args)throws Exception {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                System.in));
        String string = null;
        while ((string = bufferedReader.readLine()) != null) {
            long num = Long.parseLong(bufferedReader.readLine());
            String[] strings = string.split("\\.");
            System.out.println(Long.parseLong(strings[0]) << 24 | Long.parseLong(
                    strings[1]) << 16 |
                    Long.parseLong(strings[2]) << 8 | Long.parseLong(strings[3]));
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder.append(String.valueOf(num >> 24)).append(".")
                    .append(String.valueOf((num >> 16) & 255)).append(".")
                    .append(String.valueOf((num >> 8) & 255)).append(".")
                    .append(String.valueOf(num & 255)).toString());
        }
    }


}
