/*
@입력 선언
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

@한 줄 입력 받기
String input = br.readLine();

@입력받은 값 String -> int(숫자) 변경
int N = Integer.parseInt(input);

@한 줄 입력받은 값 공백 기준으로 배열 담기
String[] line = br.readLine().split(" ");

@변경 가능한 String 문자열을 만들기 위한 StringBuilder 사용법
StringBuilder sb = new StringBuilder();
sb.append("붙이고").append("싶은");
sb.append("문자열");

bw.write(sb.toString()); --> String 형변환

bw.write(String.valueOf(N));

-------------------------------------------

@출력 선언 (String만 출력 가능 / System.out.print 종류를 사용하려면 bw 선언 X)
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

@출력
bw.write()

@줄바꿈
bw.newLine();

@버퍼 내용 출력
bw.flush();

-------------------------------------------

@BufferedWriter 닫기
bw.close(); 
@BufferedReader 닫기
br.close(); 
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        int[] divisor = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(divisor);

        if (divisor.length == 1){
            result = divisor[0] * divisor[0];
        }else{
            result = divisor[0] * divisor[divisor.length-1];
        }


        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}