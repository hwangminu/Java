package Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        // .equals() : 앞의 변수와 ()안의 변수가 같은지 비교 해서 true / false 로 변환
        System.out.println(s1.equals("Java"));  // true
        System.out.println(s2.equals("python")); // false

        System.out.println(s2.equalsIgnoreCase("python"));
        // .equalsIgnoreCase() : 대소문자 구분 없이 문자열내용만 가지고 비교한다 true / false

        // 문자열 비교 심화
        s1 = "1234";    // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true (내용을 참조)
        System.out.println(s1 == s2);   // true ( 참조)

        s1 = new String("1234");
        s2 = new String("1234"); // 다른 메모리에 새로 정의
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);   // false ? ( s1 과 s2가 참조하는 내용이 다르다)
        // 위의 경우 메모리에 저장된 s1 의 데이터를 s2도 가져다 쓰는데 (참조)
        // 문자열의 비교는 == 말고 .equals()를 사용한다.


    }
}
