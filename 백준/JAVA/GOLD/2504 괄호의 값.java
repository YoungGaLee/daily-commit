
import static java.util.Arrays.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        int answer = 0;
        int calculate = 1; // 1에서 부터 시작

        Stack<Character> stack = new Stack<>(); // 알맞은 문자열인지 확인하는 기능, pop시키는 기능
        char prev = 0;


        loop:
        for (int i=0; i<inputStr.length(); i++) {
            char frag = inputStr.charAt(i);
            char current = inputStr.charAt(i);
            switch (current) {
                case '(':
                    calculate *= 2;
                    stack.push(frag);
                    break;

                case '[':
                    calculate *= 3;
                    stack.push(frag);
                    break;

                case ')':
                    stack.pop();

                    if (prev == '(') {
                        answer += calculate;
                    }
                    calculate /= 2;
                    break;

                case ']':
                    stack.pop();

                    if (prev == '[') {
                        answer += calculate;
                    }
                    calculate /= 3;
                    break;
            }
            prev = current;
        }

        if(!stack.isEmpty()) answer = 0;

        System.out.println(answer);
    }
}
