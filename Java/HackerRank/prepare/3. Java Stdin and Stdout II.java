// nextLine() 사용시의 유의점을 알려주는 챕터
"""
nextInt(), nextDouble() 같은 메서드를 사용한 이후 
nextLine()을 사용하면 버퍼에 남아있는 \n을 읽어들이기 때문에 nextLine() 메서드가 바로 리턴해버린다.
그러므로 nextLine()을 호출하기 전에 nextLine()을 한번 쓰면 된다.
"""

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        input.nextLine();
        String stringValue = input.nextLine();
        
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

    }
}
