package Chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and",","));
        // .replace(" ~~ ", "~~") : 앞의 ""안에 있는 문장을 뒤에 "" 안 문장으로 변환한다.

        System.out.println(s.substring(7));
        // .substring() : ()안에 적은 순서 까지의 문장을 빼고 출력한다.
        System.out.println(s.substring(s.indexOf("Java")));
        // .substring() 안 ()에는 .indexOf()를 사용할수있다.
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        // "Java" 가 시작되는 위치부터, "."이 시작하는 위치 바로 앞까지 잘라낸다.

        // 공백 제거
        s = "            I love Java.            ";
        System.out.println(s);
        System.out.println(s.trim());   // .trim : 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);

        System.out.println(s1.concat(",").concat(s2));
        // .concat() : s1에 "," 을 결합한다. 뒤에 .concat()을 연속으로 결합할수있다

    }
}
