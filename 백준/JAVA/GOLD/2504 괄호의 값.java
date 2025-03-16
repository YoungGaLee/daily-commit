
import static java.util.Arrays.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = stream(br.readLine().split(""))
                .collect(Collectors.toCollection(ArrayList::new));

        int answer = 0;
        Stack<String> stack = new Stack<>();
        String prev = "";
        int cur = 1; // 1에서 부터 시작

        loop:
        for (String word : words) {

            switch (word) {
                case "(" -> {  
                    cur *= 2;
                    stack.push(word);
                }
                case "[" -> {
                    cur *= 3;
                    stack.push(word);
                }
                case ")" -> {  

                    if (stack.isEmpty() || !stack.peek().equals("(")) { 
                        answer = 0;
                        break loop;
                    } else if (prev.equals("(")) 
                        answer += cur;
                    stack.pop();
                    cur /= 2;
                }
                case "]" -> {
                    if (stack.isEmpty() || !stack.peek().equals("[")) {
                        answer = 0;
                        break loop;
                    } else if (prev.equals("["))
                        answer += cur;
                    stack.pop();
                    cur /= 3;
                }
            }
            prev = word; 
        }

        if(!stack.isEmpty()) 
            answer = 0;
        System.out.println(answer);
    }
}
