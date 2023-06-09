package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        // or 연산자 3중에 하나라도 true 이면 결과는 true (||)
        System.out.println(김치찌개 || 계란말이 || 제육볶음);   // true

        // and 연산자 3개가 모두 true 여야만 결과가 true (&&)
        System.out.println(김치찌개 && 계란말이 && 제육볶음);   // false

        System.out.println((5 > 3) && (3 > 1)); // 두 식이 모두 true 여야 ture // 결과는 true

        System.out.println((5 > 3) && (3 < 1)); // 결과는 false

        // or 연산
        System.out.println((5 >3 ) || (3 > 1));  // 하나라도 만족하면 true // 결과는 true
        System.out.println((5 > 3) || (3 < 1));  // 앞의 식이 true 이므로 결과는 true
        System.out.println((5 < 3) || (3 < 1)); //  두 식 모두 거짓 이므로 결과는 false

        // System.out.println(1 < 3 < 5);   참고용 코드 이렇게는 계산 할수 없음

        // 논리 부정 연산자 : ! 를 붙히면 반대 되는 결과가 나온다
        System.out.println(!true);  // false

        System.out.println(!(5 == 5));  // false
        System.out.println(!(5 == 3));  // true
        







    }
}
