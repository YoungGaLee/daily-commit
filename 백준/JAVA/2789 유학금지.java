/* 
아이디어: 입력 문자열에 대해 C > A > M > B > R > I > D > E > G > E 순으로 해당 글자 들어있는지 확인
    C 확인 후, 입력문자열 업데이트 - 문자열에서 C 사라진 상태
    A 확인 후, 입력문자열 업데이트 - 문자열에서 A 사라진 상태 
    ... >> 모두 마친 후, 검열된 값 출력
*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String update;
        String result;
        String inputWord = br.readLine();
        String prohibit = "CAMBRIDEGE";

        for (int i=0; i<prohibit.length(); i++){
            update = "";
            for(int j=0; j<inputWord.length(); j++){ // 업데이트된 문자열의 길이만큼
                if (prohibit.charAt(i) == inputWord.charAt(j)){ // 해당문자 존재하면 추가하지 않음
                    continue;
                }else{   // 같지 않은 문자는 업데이트 문자열에 추가
                    update += inputWord.charAt(j);
                }
            }
            inputWord = update; // 업데이트
        }
        result = inputWord;

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
