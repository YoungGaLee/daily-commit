/*
java.util 패키지의 Scanner 클래스를 사용하면 콘솔에서 데이터를 입력 받을 수 있다. 
생성자에 System.in 매개값을 줘서 Scanner 객체를 생성한다.

scan.next()/nextLine()/nextInt()/nextDouble();
nextLine : 안녕 반가워  [Enter]
next : 안녕 만 받을 수 있음  [space]
(주의! nextLine은 개행문자를 포함함
next로 띄어낸 나머지는 버퍼에 저장되어 있음. space까지)
next + nextLine 써야 하는 상황이면 중간에 nextLine()하나 끼우라는 말인듯

new : 클래스 타입의 객체를 생성해주는 역할, 메모리 할당, 참조값 리턴
참조 : 자료형인듯. scan이 참조형이라고 함. (기본형이 아닌것은 모두 참조형)
해당 객체의 메모리에 값을 할당하거나 메소드를 호출할때 사용되는 참조변수.
주소와 비슷한 개념이라고 우선은 이해하려하지만 
주소값과 참조값은 다르다는 걸 기억. 또한 참조값은 정수임.(주소값과 인덱스 그 언저리...?)
{참조값 : 주소값} > 주소값에 해당하는 메모리에 접근, 변수명의 자리에 아모르겠다
일단 너무 초반이라 이해를 잘 못하는 것 같다. 일주일 후에 다시 ㄱㄱ
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
