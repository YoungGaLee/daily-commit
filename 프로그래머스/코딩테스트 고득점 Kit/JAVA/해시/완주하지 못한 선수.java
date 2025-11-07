import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for (String athlete : participant){
            map.put(athlete, map.getOrDefault(athlete, 0) + 1);
        }
        
        for(String athlete : completion){
            map.put(athlete, map.get(athlete) - 1);
        }
        
        for (String name : map.keySet()){
            if(map.get(name) == 1){
                answer = name;
            }
        }
        
        return answer;
    }
}
