//자바는 기본 라이브러리가 없는건가요...?
//앞으로 쓸때마다 항상 이렇게 불러와야하나요....? 다 기억해야해...?


//Q. throws?
//Q. BufferedReader, InputStreamReader 클래스의 정확한 기능
//Q. Stream이라는게 계속 나오는데... 정확한 개념
//Q. read도 next처럼 여러가지 종류가 있나? trim 리마인드
//Q. close 꼭 해줘야하는건가? 정확한 효과가 뭐지? 


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
        
        if( N%2 == 0) {     
            if (2 <= N && N < 6){
                System.out.println("Not Weird");
            }
            else if(6 <= N && N <= 20){
                System.out.println("Weird");
            }
            else if (N > 20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        } 

        bufferedReader.close();
    }
}
