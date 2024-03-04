import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        String line = " ";
        while(sc.hasNext()){
            num++;
            line = sc.nextLine();
            String result = String.format("%d %s", num, line);
        
            System.out.println(result);
        }
    }
}
