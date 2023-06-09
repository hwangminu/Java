package Chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        // 명확한 횟수가 정해져 있지 않은 반복문일때 사용

        int distance = 25;  // 전체 거리는 25m
        int move = 0;       // 현재 이동 거리
        while (move < distance){    // 현재 이동거리가 전체 거리보다 작다는 조건이 참 인 동안
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;  // 3미터 이동
        }
        System.out.println("도착하였습니다");

        // 무한 루프
        move = 0;
        while (move < distance){    // 현재 이동거리가 전체 거리보다 작다는 조건이 참 인 동안
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착하였습니다");
    }
}
