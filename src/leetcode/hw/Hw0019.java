package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hw0019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        //  Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        int i = 0;
        while ((str = br.readLine()) != null) {
            int index = str.indexOf(' ');
            int line = Integer.parseInt(str.substring(index + 1));
            String path = str.substring(0, index);
            String file = path.substring(path.lastIndexOf('\\') + 1);
            if (file.length() > 16) {
                file = file.substring(file.length() - 16);
            }
            if (!map3.containsKey(path+line)) {
                map3.put(path+ file,"");
                if (map2.containsKey(file + " " + line)) {
                    map2.put(file + " " + line, map2.get((file + " " + line)) + 1);
                } else {
                    queue.offer(file + " " + line);
                    map2.put(file + " " + line, 1);
                }
            }
        }

        while (queue.size() > 0) {
            while (queue.size() > 8) {
                queue.poll();
            }
            String f = queue.poll();
            System.out.println(  f + " " + map2.get(f));
        }
    }
    }

