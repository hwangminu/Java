package Chap_04;
        // 조건문을 활용하여, 주차 요금 정산 프로그램을 작성하세요.

        // 조건
        // 주차요금은 시간당 4000원 (1일 최대 요금은 30000원)
        // 경차, 장애인 차량은 최종 요금에서 50% 할인

        // 주차요금 예시
        // 일반 차량 5시간 주차 시 20000원
        // 경차 5시간 주차 시 10000원
        // 장애인 차량 10시간 주차시 15000원

public class _Quiz4_java {
    public static void main(String[] args) {

        int hour = 5; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean wdp = false; // 장애인 차량 여부

        int price = hour * 4000;    // 시간 당 4000원

        // 30000원 초과 시 일일 최대 요금으로 수정
        if(price > 30000 ){
            price = 30000;
        }
        // 경차 또는 장애인 차량인 경우 50% 할인
        if(isSmallCar || wdp ){
            price /= 2; // 50% 할인 요금 적용
        }

        // 실행결과 출력
        System.out.println("주차 요금은 : " + price + "원 입니다");
        System.out.println();

        hour = 10; // 주차 시간
        isSmallCar = false; // 경차 여부
        wdp = true; // 장애인 차량 여부

        price = hour * 4000;    // 시간 당 4000원

        // 30000원 초과 시 일일 최대 요금으로 수정
        if(price > 30000 ){
            price = 30000;
        }
        // 경차 또는 장애인 차량인 경우 50% 할인
        if(isSmallCar || wdp ){
            price /= 2; // 50% 할인 요금 적용
        }

        // 실행결과 출력
        System.out.println("주차 요금은 : " + price + "원 입니다");
    }
}
