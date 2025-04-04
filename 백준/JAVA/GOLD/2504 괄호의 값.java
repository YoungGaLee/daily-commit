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
        float calculate = 1; 

        Stack<Character> stack = new Stack<>(); 
        char prev = 0;


        loop:
        for (int i=0; i<inputStr.length(); i++) {
            char frag = inputStr.charAt(i);
            switch (frag) {
                case '(':
                    calculate *= 2;
                    stack.push(frag);
                    break;

                case '[':
                    calculate *= 3;
                    stack.push(frag);
                    break;

                case ')':
                    try {
                        stack.pop();
                    } catch (Exception e) {
                        answer = 0;
                        break loop;
                    }

                    if (prev == '(') {
                        answer += calculate;
                    }
                    calculate /= 2;
                    break;

                case ']':
                    try {
                        stack.pop();
                    } catch (Exception e) {
                        answer = 0;
                        break loop;
                    }

                    if (prev == '[') {
                        answer += calculate;
                    }
                    calculate /= 3;
                    break;
            }
            prev = frag;
            if(calculate%1 != 0){
                answer = 0;
                break loop;
            }
        }

        if(!stack.isEmpty()) answer = 0;

        System.out.println(answer);
    }
}
