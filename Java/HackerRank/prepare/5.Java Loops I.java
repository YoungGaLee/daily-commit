//문자열 fomat 출력시 : printf사용 (c언어와 동일)
//입출력 메소드에서 예외처리(throws)가 없으면 컴파일 에러가 발생한다.
//java에서 print,println,printf 메서드는 예외처리가 되어있지만 이를 제외하고는 모두 해줘야한다. 
// 걍 입출력할때, 습관적으로 import java.io.*하고 throws IOException하면 된다. 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int n=1; n<=10;n++){
            System.out.printf("%d x %d = %d\n", N,n,N*n);
        }

        bufferedReader.close();
    }
}
