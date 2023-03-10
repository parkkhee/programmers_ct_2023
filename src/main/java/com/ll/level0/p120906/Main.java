package com.ll.level0.p120906;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        String sum = Integer.toString(n);

        for (int i = 0; i < sum.length(); i++) {
            answer += sum.charAt(i) - '0';
        }


        return answer;
    }
}