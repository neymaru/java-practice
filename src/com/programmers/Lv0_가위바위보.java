package com.programmers;

public class Lv0_가위바위보 {
    public String solution(String rsp) {
        String answer = "";
        String[] s = new String[rsp.length()];

        for(int i=0; i<rsp.length(); i++){
            s[i] = rsp.substring(i,i+1);
        }

        for(int i=0; i<rsp.length(); i++){
            if(s[i].equals("2"))
                answer += "0";
            if(s[i].equals("0"))
                answer += "5";
            if(s[i].equals("5"))
                answer += "2";
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv0_가위바위보 result = new Lv0_가위바위보();
        System.out.println(result.solution("2"));
        System.out.println(result.solution("205"));
    }
}