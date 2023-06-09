package Chap_04;

public class _04_switchcase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if else 문을 이용한 방법 (여러 조건 또는 범위에 해당하는 조건)
        int rangking = 1;   // 1등

        if( rangking== 1){
            System.out.println("전액 장학금");
        }
        else if(rangking == 2 || rangking == 3){
            System.out.println("반액 장학금");
        }
        else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch case 문 이용 (명확한 케이스가 있는 경우)
        switch (rangking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                // Duplicate branch in 'switch' 스위치 내부에 중복이 있다.
                break;
            default:
                System.out.println("장학금 대상 아님");
        } // end of case
        System.out.println("조회 완료 #2");

        // case 2와 3을 통합
        rangking = 2;
        switch (rangking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // 여러 case 에 동일한 동작을 실행 하려면 break 걸지 않는다
            case 3:
                System.out.println("반액 장학금");
                // Duplicate branch in 'switch' 스위치 내부에 중복이 있다.
                break;
            default:
                System.out.println("장학금 대상 아님");
        } // end of case
        System.out.println("조회 완료 #3");

        // 중고 상품의 등급에 따른 가격을 책정(1급 : 최상, 4급 : 최하)
        int grade = 1;      // 등급
        int price = 7000;   // 기본 가격
        switch (grade){
            case 1:
                price += 1000;  // price = price + 1000
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 : " + price + "원 입니다");

    }  // end of main
}  // end of class
