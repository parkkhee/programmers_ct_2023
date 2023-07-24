import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        List<Integer> answerArr = new LinkedList<>(map.keySet());
        
        
        answerArr.sort((o1,o2) -> map.get(o1) - map.get(o2) );
        
        int num=0;
        
        while(num>0){
            k -= map.get(answerArr.get(num));
            answer++;
            num++;
        }
        
        
        
        return answer;
    }
}
