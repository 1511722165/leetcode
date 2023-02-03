package leetcode.leetcode0001_1000.leetcode601_700.leetcode0641_0650;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LeetCode0648 {

    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else if(o1.length()<o2.length()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        for (String item:dictionary)
        {
            System.out.println(item);
        }
        String[] arrs=sentence.split(" ");
        StringBuilder sb =new StringBuilder();
        for(String item:arrs){
            int i=0;
            for(String d:dictionary){
                if(item.startsWith(d)){
                    sb.append(d+" ");
                    i=1;
                    break;
                }
            }
            if(i==0){
                sb.append(item+" ");
            }

        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    public static void main(String[] args) {
        LeetCode0648 demo =new LeetCode0648();
        List<String> list=new ArrayList<>();
        list.add("catt");
        list.add("cat");
        list.add("bat");
        list.add("rat");
        String s="the cattle was rattled by the battery";
        demo.replaceWords(list,s);
    }
}
