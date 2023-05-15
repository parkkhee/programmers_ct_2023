package com.ll.level2.p42583;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

    }

}
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Deque<Integer> q = new LinkedList<>();

        int idx =0;
        int sec=0;
        int s=1;
        int sum =0;

        while (true) {
            sec++;

            if (sum + truck_weights[idx] <= weight) {

                q.offer(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;

            }else{

                if (sec < bridge_length) {

                    sec = bridge_length;

                }

                sum -= q.poll();
                break; //일단

            }
        }

        return answer;
    }
}
