// https://atomicliquors.tistory.com/7
/* 자바 프로그램은 '자바가상머신JVM'을 통해 실행됨.
JVM은 다양한 클래스 중에서 main이라는 이름의 매서드를 찾아 프로그램을 시작함.

접근제어자
- public : main 함수를 찾을 수 있도록한다.(접근제한 없음.)
private(같은 클래스 내에서만 접근 가능)
default(같은 패키지 내에서만 접근 가능) 걍 void
protected(같은 패키지 + 다른 패키지의 자식클래스에서 접근가능)
import시, public만 정상 호출
따라서 코드를 처음 작성할때, main메소드는 아무 접근 제약이 존재하지 않도록 public을 붙여줘야 함. 
나머지는 클래스, 패키지 안에서 작동하기 때문에 아무 클래스도 불러오지 못한 시점에서 프로그램을 시작할 수 없는 상황이 발생함. 따라서 무조건 public main ! 

- static : main 함수를 곧바로 실행할 수 있도록 한다. 
클래스의 인스턴스를 생성하지 않아도 호출할 수 있다. 
- void : main 함수가 종료되면 프로그램도 종료되며 return값이 없다. 
String[] args : main함수 내부에서 사용할 수 있는 String데이터를 전달 할 수 있다. 
my) input() 같은거. / c언어랑 비슷한 듯

System : 표준 입출력 클래스
System.out : 출력을 위한 클래스 변수 (표준출력 스트림)
System.out.println() : 메소드
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}
