/*
아이디어: (정수입력 > 짝수인지 확인과 동시에 min값 갱신, sum > 출력
         홀수값 하나도 없을 경우 : 디폴트를 홀수없음(oddExist=False)로 하다가 홀수 들어오면 'true'로 바꿈
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean oddExist = false;


        for (int i=0; i<7; i++){
            int num = Integer.parseInt(br.readLine());

            if(num%2 == 1){
                oddExist = true;     //홀수 존재
                sum += num;          //sum
                min = Math.min(min, num);   //min값 갱신
            }
        }

        if (oddExist){
            bw.write(sum + "\n" + min);
        } else {
            bw.write("-1");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}
