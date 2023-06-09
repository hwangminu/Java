package chap_02;

public class _01_Oprator {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 1);  // 5
        System.out.println(4 - 2);  // 2
        System.out.println(4 * 2);  // 8
        System.out.println(4 / 2);  // 2
        System.out.println(5 / 2);  // 2
        System.out.println(2 / 4);  // 0

        System.out.println(4 % 2); //  0    // 4를 2로 나누었을때 나머지 (나머지 연산자)
        System.out.println(5 % 2); //  1    //  5를 2로 나누면 2가 되고 1이 남는데 나누기 연산자에선 1이 나온다.

        // 우선 순위 연산

        System.out.println(2 + 2 * 2);  // 8 or 6
        System.out.println((2 + 2) * 2);  // 8   // ()를 사용하면 우선순위로 먼저 연산한다
        System.out.println(2 + ( 2 * 2));   // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;
        System.out.println(c);  // 10

        c = a * b;
        System.out.println(c);  // 200

        c = a / b;
        System.out.println(c);  // 2

        c = a % b;
        System.out.println(c);  // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);    // 10
        System.out.println(++val);  // 1을 더하고 더해진 값을 출력하라 // 11
        System.out.println(val);    // 11

        val = 10;
        System.out.println(val);    // 10
        System.out.println(val++);  // val 을 출력하고 뒤에 1 을 더하라    // 10
        System.out.println(val);    // 11

        val = 10;
        System.out.println(val);    // 10
        System.out.println(--val);  // 9
        System.out.println(val);    // 9

        val = 10;
        System.out.println(val);    // 10
        System.out.println(val--);  // 10
        System.out.println(val);    // 9

        // 은행 대기 번호 표 예시 문제
        int waiting = 0;
        System.out.println(" 대기 인원 : "+ waiting++);    // "대기 인원 : 0
        System.out.println(" 대기 인원 : "+ waiting++);    // "대기 인원 : 1
        System.out.println(" 대기 인원 : "+ waiting++);    // "대기 인원 : 2
        System.out.println(" 총 대기 인원 : " + waiting);   // "총 대기인원 : 3











    }
}
