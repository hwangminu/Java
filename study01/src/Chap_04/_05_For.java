package Chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다");
        // 또 다른 손님이 들어오면 ?
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");

        // 만약에 인사방법이 바뀐다면 ?
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");

        // 매장 이름이 바뀐다면 ?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");

        System.out.println("---------반복문 사용---------");
        // 반복문 사용 For
        // (선언;, 조건;, 증감){}
        for(int i = 0; i < 10; i++){    // i 라는 값은 0 이고, i 가 10보다 작을동안 i를 ++ 한다
            /*.. 수행 명령 ...*/
            //System.out.println("어서오세요. 나코 입니다" + i);
            // System.out.println("환영합니다. 코나 입니다" + i);
            System.out.println("환영합니다. 코나 입니다" + i);
        }

        // 짝수만 출력
        // (fori 만 적으면 자동완성)
        // 0,2,4,6,8 만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 홀수만 출력 ( 1,3,5,7,9)
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 숫자
        // 5,4,3,2,1
        for (int i = 5; i > 0; i--) {   // i가 0보다 클 동안
            System.out.print(i);
        }
        System.out.println();

        // 1 부터 10까지 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0 ;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지의 총합은 : " + sum + "입니다");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum);

    }
}
