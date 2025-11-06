import java.util.*;

class Solution {
    public int solution(int[] nums) { 
        Set<Integer> set = new HashSet<>();
        
        int maximun = nums.length / 2;
        int answer = 0;
        
        for (int num : nums) {
            set.add(num);
        }
        
        if (set.size() > maximun){
            answer = maximun;
        }
        else{
            answer = set.size();
        }
        
        return answer;
    }
}
