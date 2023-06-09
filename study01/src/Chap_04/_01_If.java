package Chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15;  // 오전 10시


        // if 문 내에서 하나의 문장을 실행 할때는 {} 생략 가능
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        }
        // if 문 내에서 두개의 문장을 실행 할때는 {] 필수
        if(hour < 14 ) {    // 시간이 달라지면 거짓이 되면 조건문 코드를 수행하지 않는다.
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우 ?
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
        // if(hour < 14  && morningCoffee == false){
        if(hour < 14  && !morningCoffee){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후 이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if(hour >= 14 || morningCoffee == true){
        if(hour >= 14 || morningCoffee){
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료#3");
    }
}
