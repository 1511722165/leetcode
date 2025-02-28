package leetcode.leetcode2001_3000.leetcode2301_2400.leetcode2351_2360;

import java.util.*;

public class LeetCode2353 {
    int n;
    Map<String, Integer> map;
    Food[][] foods;
    int size;
    Map<String, String> foodToCuisine;

    public LeetCode2353(String[] foods, String[] cuisines, int[] ratings) {
        this.n = foods.length;
        HashSet<String> set = new HashSet();
        set.addAll(Arrays.asList(cuisines));
        int flag = 0;
        this.size = set.size();
        this.foods = new Food[size][26];
        this.map = new HashMap<>(size);
        foodToCuisine = new HashMap<>(n);
        //初始化 foods
        for (int i = 0; i < n; i++) {
            this.foodToCuisine.put(foods[i], cuisines[i]);
            //第二下标
            int second = foods[i].charAt(0) - 'a';
            if (map.containsKey(cuisines[i])) {
                int index = map.get(cuisines[i]);
                Food add = new Food(foods[i], ratings[i]);
                Food food = this.foods[index][second];
                if (food == null) {
                    this.foods[index][second] = add;
                } else {
                    food = this.sortRate(food, add);
                    this.foods[index][second] = food;
                }

            } else {
                map.put(cuisines[i], flag);
                Food food = new Food(foods[i], ratings[i]);
                this.foods[flag][second] = food;
                ++flag;
            }
        }
    }

    //需要优化
    private Food sortRate(Food food, Food add) {
        if (food == null) {
            return add;
        }
        if (food.rate < add.rate) {
            add.next = food;
            return add;
        } else if (food.rate == add.rate) {
            //需要判断字典序
            if (food.compareTo(add) > 0) {
                food.next = this.sortRate(food.next, add);
                return food;
            } else {
                add.next = food;
                return add;
            }
        } else {
            food.next = this.sortRate(food.next, add);
            return food;
        }
    }

    private Food remove(Food food, String name) {
        if (food.food.equals(name)) {
            return food.next;
        } else {
            food.next = this.remove(food.next, name);
            return food;
        }
    }

    public void changeRating(String food, int newRating) {
        //需要根据food找type
        int index = map.get(foodToCuisine.get(food));
        int second = food.charAt(0) - 'a';

        Food food1 = this.foods[index][second];
        //找原先的 删除 新增新的
        food1 = this.remove(food1, food);
        Food add = new Food(food, newRating);
        food1 = this.sortRate(food1, add);
        this.foods[index][second] = food1;
    }

    public String highestRated(String cuisine) {
        //循环26次 找出最大的
        Food[] food = foods[map.get(cuisine)];
        int rate = 0;
        int index = -1;
        for (int i = 25; i >= 0; i--) {
            if (food[i] != null && rate <= food[i].rate) {
                index = i;
                rate = food[i].rate;
            }
        }
        return food[index].food;

    }

//    public static void main(String[] args) {
//        LeetCode2353 demo = new LeetCode2353(new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
//                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
//                new int[]{9, 12, 8, 15, 14, 7});
//        System.out.println(demo.highestRated("korean"));
//        System.out.println(demo.highestRated("japanese"));
//        demo.changeRating("sushi", 16);
//        System.out.println(demo.highestRated("japanese"));
//        demo.changeRating("ramen", 16);
//        System.out.println(demo.highestRated("japanese"));
//
//    }
}


class Food implements Comparable<Food> {
    String food;
    int rate;
    Food next;

    public Food(String food, int rate) {
        this.food = food;
        this.rate = rate;
    }

    @Override
    public int compareTo(Food o) {
        int result = this.food.compareTo(o.food);
        return result;
    }


    //    @Override
//    public int compare(Food o1, Food o2) {
//        int result=o1.food.compareTo(o2.food);
//        return result;

//        int len2 = o1.food.length();
//        int len1 = o1.food.length();
//        int index = 0;
//        while (index < len1 && index < len2) {
//            if (o1.food.charAt(index) == o2.food.charAt(index)) {
//                index++;
//            } else if (o1.food.charAt(index) < o2.food.charAt(index)) {
//                return 1;
//            }
//            return -1;
//        }
//        return 0;
//}


}