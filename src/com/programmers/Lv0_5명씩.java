package com.programmers;

import java.util.ArrayList;
import java.util.List;

public class Lv0_5명씩 {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }
        return answer.toArray(String[]::new);
    }


    public static void main(String[] args) {
        Lv0_5명씩 result = new Lv0_5명씩();
        System.out.println(result.solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"}));
    }
}