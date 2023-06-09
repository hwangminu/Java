package Chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do while
        int distance = 25;  // 전체 거리 25m
        int move = 0;       // 전체 이동 거리 0m
        int height = 2;     // 키 2m

        while((move + height) < distance ){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 : " + move);
            move += 3;
        }
        System.out.println("도착 했습니다");

        System.out.println("반복문 #1");

        // 키가 엄청나게 큰 사람 ?
        move = 0 ;
        height = 25;    // 키가 25m

        while((move + height) < distance ){     // 처음부터 조건이 거짓이기 때문에 반복을 수행하지않는다
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 : " + move);
            move += 3;
        }
        System.out.println("도착 했습니다");
        System.out.println("반복문 #2");

        // Do while 반복문
        do{     // do 영역을 한번은 수행하고, 반복문을 수행한다. while 문이 거짓이라면 탈출
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다");




    }
}
