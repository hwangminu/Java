package Chap_03;

public class _01_String1 {  // 문자열
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29
        // .length() : 변수에 들어간 문자열의 길이를 확인 할수 있다.

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        // .toUppercase() : 변수 속에 들어간 문장이 모두 대문자로 변경

        // 소문자로 변경
        System.out.println(s.toLowerCase());
        // .toLowerCase() : 변수 속 문장을 모두 소문자로 변경

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));
        // .contains(" ~~ ") : 문장안에 "" 포함된 단어를 확인 할수있다 true / false
        System.out.println(s.indexOf("Java"));
        // .indexOf(" ~~ ") : 문장안에 "" 포함된 단어의 위치를 확인할 수 있다. 처음에 해당하는
        // 문자열은 0부터 시작한다.
        System.out.println(s.indexOf("C#"));
        // 포함되어있지 않은 단어는 -1을 반환한다.
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        // .lastIndexOf : 마지막에 일치하는 위치정보

        // 시작과 끝 문장
        System.out.println(s.startsWith("I Like"));
        // .startsWith("") : "" 안에 있는 문장으로 시작한다면 true 로 반환
        System.out.println(s.endsWith("."));
        // .endsWith("") : "" 안의 문장으로 끝난다면 true 로 반환
    }
}
