package leetcode.leetcode0001_1000.leetcode701_800.leetcode0721_0730;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0729 {
}

class MyCalendar {

    private int left;
    private int right;
    private List<MyCalendar> myCalendar;


    public MyCalendar() {
        myCalendar = new ArrayList<>();
    }

    public MyCalendar(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public boolean book(int startTime, int endTime) {
        if (myCalendar.size() == 0) {
            myCalendar.add(new MyCalendar(startTime, endTime));
            return true;
        }
        for (MyCalendar calendar:myCalendar){
            if(calendar.left<=startTime&&calendar.right>=endTime){
                return false;
            }
            if(calendar.left<=startTime&&calendar.right>startTime){
                return false;
            }

            if(calendar.left<endTime&&calendar.right>endTime){
                return false;
            }
            if(calendar.left>=startTime&&calendar.right<=endTime){
                return false;
            }
        }
        myCalendar.add(new MyCalendar(startTime, endTime));
        return true;
    }
}