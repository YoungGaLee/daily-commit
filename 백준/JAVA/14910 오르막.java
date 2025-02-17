/*
아이디어: 입력을 받아 배열로 저장한 뒤, 정수 하나하나에 대해
    - 이전 수보다 작은지  >> Bad 출력 후, break (디폴트는 Good으로 설정)
 */
                    
    

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] input = br.readLine().split(" ");
        int before = Integer.MIN_VALUE;
        String result = "Good";

        for (String num : input){
            int current = Integer.parseInt(num);
            if (current < before){
                result = "Bad";
                break;
            }
            before = current;
        }
        bw.write(result);

        bw.flush();
        bw.close();
    }
}
