package leetcode.leetcode0001_1000.leetcode401_500.leetcode0401_0410;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class LeetCode0401 {
	/**
	 * 重要的是用Stringbuilder
	 * @param num
	 * @return
	 */
	public List<String> readBinaryWatch(int num) {
		if (num > 8)
			return new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		int[][] hours = { { 0 }, { 1, 2, 4, 8 }, { 3, 5, 6, 9, 10 }, { 7, 11 } };
		int[][] mins = { { 0 }, { 1, 2, 4, 8, 16, 32 }, { 3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, 34, 36, 40, 48 },
				{ 07, 11, 13, 14, 19, 21, 22, 25, 26, 28, 35, 37, 38, 41, 42, 44, 49, 50, 52, 56 } };
		for (int i = 0; i <= num && i < 4; i++) {
			switch (num - i) {
			case 0:
				reList(list, hours[i], mins[0], 0);
				break;
			case 1:
				reList(list, hours[i], mins[1], 0);
				break;
			case 2:
				reList(list, hours[i], mins[2], 0);
				break;
			case 3:
				reList(list, hours[i], mins[3], 0);
				break;
			case 4:
				reList(list, hours[i], mins[2], 1);
				break;
			case 5:
				reList(list, hours[i], mins[1], 1);
				break;

			default:
				break;
			}
		}

		return list;
	}

	public List<String> reList(List<String> list, int[] a, int[] b, int flag) {
		for (int i = 0; i < a.length; i++) {
			if (flag != 1) {
				for (int j = 0; j < b.length; j++) {
					StringBuilder sb = new StringBuilder();
					sb.append(a[i]);
					if (b[j] >= 10) {
						sb.append(":");
						sb.append(b[j]);
						list.add(sb.toString());
					} else {
						sb.append(":0");
						sb.append(b[j]);
						list.add(sb.toString());
					}
				}
			} else {
				for (int j = 0; j < b.length; j++) {
					StringBuilder sb = new StringBuilder();
					sb.append(a[i]);
					if (63 - b[j] >= 10 && 63 - b[j] < 60) {
						sb.append(":");
						sb.append(63 - b[j]);
						list.add(sb.toString());
					} else if (63 - b[j] < 10) {
						sb.append(":0");
						sb.append(63 - b[j]);
						list.add(sb.toString());
					}
				}
			}

		}
		return list;
	}

	// List<String> result;
	// public List<String> readBinaryWatch(int num) {
	// result=new ArrayList<String>();
	// //判断输入
	// if(num<0)
	// return result;
	// //LED灯，前四个为小时，后六个为分钟
	// int[] nums=new int[]{8,4,2,1,32,16,8,4,2,1};
	// backTrack(num,nums,0,0,0);
	// return result;
	// }
	// public void backTrack(int num,int[] nums,int start,int hour,int minute){
	// if(num==0){
	// //判断时间是否正确
	// if(hour>11||minute>59)
	// return;
	// StringBuilder tmp=new StringBuilder();
	// //小时
	// tmp.append(hour);
	// tmp.append(":");
	// //分钟
	// if(minute<10)
	// tmp.append(0);
	// tmp.append(minute);
	// result.add(new String(tmp));
	// return ;
	// }
	// for(int i=start;i<nums.length;i++){
	// /*回溯做选择*/
	// //判断是小时还是分钟
	// if(i<4)//小时
	// hour+=nums[i];
	// else
	// minute+=nums[i];
	// //递归
	// backTrack(num-1,nums,i+1,hour,minute);
	// /*回溯取消选择*/
	// if(i<4)//小时
	// hour-=nums[i];
	// else
	// minute-=nums[i];
	// }
	// }
	//

	public static void main(String[] args) {
		LeetCode0401 demo = new LeetCode0401();
		System.out.println(demo.readBinaryWatch(4).toString());
	}
}
