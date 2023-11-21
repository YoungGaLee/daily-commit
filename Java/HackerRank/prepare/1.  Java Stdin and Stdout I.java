/*
java.util 패키지의 Scanner 클래스를 사용하면 콘솔에서 데이터를 입력 받을 수 있다. 
생성자에 System.in 매개값을 줘서 Scanner 객체를 생성한다.

scan.next()/nextLine()/nextInt()/nextDouble();
nextLine : 안녕 반가워  [Enter]
next : 안녕 만 받을 수 있음  
(주의! nextLine은 개행문자를 포함함
next로 띄어낸 나머지는 버퍼에 저장되어 있음. space까지)
next + nextLine 써야 하는 상황이면 중간에 nextLine()하나 끼우라는 말인듯
[space]
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}
