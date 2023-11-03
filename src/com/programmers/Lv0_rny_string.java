package com.programmers;

public class Lv0_rny_string {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }

    public String solution2(String rny_string) {
        String[] arr = rny_string.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("m")) {
                arr[i] = "rn";
            }
        }
        return String.join("", arr);
    }

    public static void main(String[] args) {
        Lv0_rny_string result = new Lv0_rny_string();
        System.out.println(result.solution("masterpiece"));
        System.out.println(result.solution("programmers"));
        System.out.println(result.solution("jerry"));
        System.out.println(result.solution("burn"));
    }
}
