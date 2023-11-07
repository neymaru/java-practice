package com.programmers;

public class Lv0_할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = "";
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                str += todo_list[i] + " ";
            }
        }
        return str.split(" ");
    }

    public static void main(String[] args) {
        Lv0_할일목록 result = new Lv0_할일목록();
        System.out.println(result.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false}));
    }
}