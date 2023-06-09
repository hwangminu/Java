package Chap_03;

public class _Quiz02 {
    // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램
    // 주민등록번호는 13자리 구성
    // 앞 6자리는 생년월일 정보, 뒷7 자리 중 첫번째 숫자는 성별정보
    // 입력 데이터는 -을 포함한 14자리의 문자열 정보
    public static void main(String[] args) {
        String s = "951234-1123456";    // 주민등록번호 14개

        System.out.println(s.substring(0, 8));

        System.out.println(s.substring(0, s.indexOf("-") + 2));
        // 0 위치 부터 - 위치 + 2 까지

    }
}


