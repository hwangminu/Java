package Chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : tap 효과를 주는 특수문자
        // 해물파정     9000원
        // 김치전      8000원
        // 부추전      8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\ : \ 나타내는 특수문자 (역슬래쉬)
        System.out.println("C:\\Program Files\\Java");
        // 파일경로를 나타낼때 많이 사용

        // \" : 큰 따옴표를 나타내는 특수문자
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은 따옴표 (작은 따옴표는 크게 상관없다)
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
