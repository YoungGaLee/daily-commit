import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNum = Integer.parseInt(br.readLine());
        String result = "";


        for(int i=0; i<testNum; i++) {
            int count=0;
            String input = br.readLine();
            for(int j=0; j<input.length();j++){
                // ( ) >> +1 -1 = 0  VPS이려면 합이 0이 되어야함. (조건1)
                // '(' : +1, ')' : -1 이라고 하면 
                if (input.charAt(j) == '('){  
                    count += 1;
                }else{
                    count -= 1;
                }
                // 또한 VPS이려면 ')'가 '('보다 먼저 나오면 안됨 (조건2)
                if(count < 0){
                    result = "NO";
                    break;
                }
            }
            if(count==0){
                result = "YES";
            } else {
                result = "NO";
            }
            bw.write(result);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}