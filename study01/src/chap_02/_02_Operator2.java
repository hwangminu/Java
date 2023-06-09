package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;   // 10을 num 에 대입
        num = num + 2;  // 2를 더해 주기 위해 Num + 2 한 값
        System.out.println(num);    // 12

        num = num - 2;
        System.out.println(num);    // 10

        num = num * 2;
        System.out.println(num);    // 20

        num = num / 2;
        System.out.println(num);    // 10

        num = num % 2;
        System.out.println(num);    // 0

        // 복합 대입 연산자
        num = 10;
        // num = num + 2;
        num += 2;
        System.out.println(num);    // 12

        num -= 2;
        System.out.println(num);    // 10

        num *= 2;
        System.out.println(num);    // 20

        num /= 2;
        System.out.println(num);    // 10

        num %= 2;
        System.out.println(num);    // 0


    }
}
