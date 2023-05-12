package com.ll.level2.p42860;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(String name) {
        int answer = 0;
        int cnt=0;
        String[] alp = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < name.length(); i++) {

            String namedotchar = "";
            namedotchar += name.charAt(i);

            for (int j = 0; j < alp.length; j++) {

                if (namedotchar.equals(alp[i])) {
                    break;
                }
                cnt++;
            }


        }



        return answer;
    }
}