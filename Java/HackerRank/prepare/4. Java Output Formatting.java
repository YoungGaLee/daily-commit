import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String word = text.next();
            
            int num = text.nextInt();
            
            String front = String.format("%-15s", word);
            String end = String.format("%03d", num);
            
            System.out.println(front + end);
        }
        System.out.println("================================");
    }
}
