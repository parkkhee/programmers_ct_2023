package com.ll.level2.p64065;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "{{2,1,3,4},{2},{2,1,3},{2,1}}";
        int[] answer = solution.solution(s);

        System.out.println(Arrays.toString(answer));
    }


}
class Solution {
    public int[] solution(String s) {


        s = s.substring(2, s.length() - 2);
        String[] sBits = s.split("},[{]");

        Map<Integer, int[]> map = Arrays.stream(sBits)
                .map(sBit -> sBit.split(","))
                .map(arr -> Arrays.stream(arr).mapToInt(Integer::parseInt).toArray())
                .collect(Collectors.toMap(arr -> arr.length, arr -> arr));

        Set<Integer> numSet = new HashSet<>();
        int[] answer = new int[map.size()];
        for (int i = 0; i < map.size(); i++) {
            int[] numArr = map.get(i+1);
            for (int j = 0; j < numArr.length; j++) {
                if (!numSet.contains(numArr[j])) {
                    numSet.add(numArr[j]);
                    answer[i] = numArr[j];
                }
            }
        }


        return answer;
    }
}