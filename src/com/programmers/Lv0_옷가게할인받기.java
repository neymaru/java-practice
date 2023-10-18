package com.programmers;

public class Lv0_옷가게할인받기 {
    public int solution(int price) {
        if (price >= 500000)
            return (int) (price * 0.80);
        else if (price >= 300000)
            return (int) (price * 0.90);
        else if (price >= 100000)
            return (int) (price * 0.95);
        else
            return (int) (price);
    }

    public static void main(String[] args) {
        Lv0_옷가게할인받기 result = new Lv0_옷가게할인받기();
        System.out.println(result.solution(150000));
        System.out.println(result.solution(580000));
    }
}