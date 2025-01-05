package leetcode.leetcode0001_1000.leetcode701_800.leetcode0731_0740;



import java.util.ArrayList;
import java.util.List;

public class LeetCode0731 {



}
class MyCalendarTwo {
    private int left;
    private int right;
    private List<MyCalendarTwo> myCalendar;


    public MyCalendarTwo() {
        myCalendar = new ArrayList<>();
    }

    public MyCalendarTwo(int left, int right) {
        this.left = left;
        this.right = right;
    }


    public boolean book(int startTime, int endTime) {
        if (myCalendar.size() == 0) {
            myCalendar.add(new MyCalendarTwo(startTime, endTime));
            return true;
        }
        int count=0;
        for (MyCalendarTwo calendar:myCalendar){
            if(calendar.left<=startTime&&calendar.right>=endTime
                    ||calendar.left<=startTime&&calendar.right>startTime
                    ||calendar.left<endTime&&calendar.right>endTime
            ||calendar.left>=startTime&&calendar.right<=endTime){
                count++;
                if (count>1){
                    return false;
                }
            }

        }
        myCalendar.add(new MyCalendarTwo(startTime, endTime));
        return true;
    }
}