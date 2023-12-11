package com.programmers;

public class Lv0_x사이의개수 {
    public int[] solution(String myString) {
        String[] splitArr = myString.split("x", myString.length());
        int[] answer = new int[splitArr.length];

        for (int i = 0; i < splitArr.length; i++) {
            answer[i] = splitArr[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_x사이의개수 result = new Lv0_x사이의개수();
        System.out.println(result.solution("oxooxoxxox"));
        System.out.println(result.solution("xabcxdefxghi"));
    }
}
