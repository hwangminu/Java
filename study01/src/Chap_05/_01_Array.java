package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        // 식당 의자는 1개씩
        // 공항 || 터미널 의자는 한줄에 여러개
        // 자바에서는 ?
        // 식당의 의자를 변수 (하나의 자료 ) 라고 한다면
        // 공항 의자는 배열( 여러개의 자료 )

        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        // 서로 다른 변수가 여러개



        System.out.println(coffeeRoss + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
       // String[] coffees = new String[4];

        // 배열 선언 두 번째 방법
        // [] 의 위치 차이
        // String coffees[] = new String[4];

//        coffees[0] = "아메리카노";
//        coffees[1] = "카푸치노";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 세 번째 방법
//        String[] coffees = new String[]{"카푸치노", "카페모카", "라떼", "카푸치노" };

        // 네 번째 방법
        String[] coffees = {"카푸치노", "카페모카", "라떼", "카푸치노" };

        System.out.println("-----------------------------------");

        // 커피 주문
        System.out.println(coffees[0] + " 하나 "); // 아메리카노 하나
        System.out.println(coffees[1] + " 하나 ");
        coffees[2] = "에스프레소";   // 배열 안 값 변경
        System.out.println(coffees[2] + " 하나 ");
        System.out.println(coffees[3] + " 하나 ");
        System.out.println("주세요");

        // 다른 자료형에서 ?
        int [] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[3] = 3;
        double [] d= new double[]{10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};
    }
}
