import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> phoneSet = new HashSet<>();
        
        for (String num : phone_book){
            phoneSet.add(num);
        }
        
        for (String phone : phoneSet) {
            
            for(int i=1; i<phone.length();i++){
                String pre = phone.substring(0,i);
                if(phoneSet.contains(pre)){
                    return false;
                }
                
            }
        }
        return answer;
    }
}
