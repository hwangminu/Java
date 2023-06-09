public class _01_variable {
    public static void main(String[] args) {

        // 변수의 타입 (primitive type / reference type)
        // primitive type : boolean, char, byte, short, int, long,float, double
        // reference type : String, System ...

        // primitive type
        // 1) 논리형 : boolean : true 와 false 중 하나의 값으로 나타낸다
        // 2) 문자형 : char : 문자를 저장하는데 사용한다
        // 3) 정수형 : int, long, byte(2진의 데이터를 다루는데 사용한다) : 정수값을 저장하는데 사용한다
        // 4) 실수형 : float, double : 실수값을 저장

        // 변수 선언 방법
        // 타입 변수명 :
       /* int score;
        score = 100;

        int score = 100;

        String str = new String("abc");
        str = null;
        */

        // 명명규칙
        // 1) 클래스의 첫 글자는 항상 대문자로 한다
        // - 변수와 메서드의 이름의 첫글자는 항상 소문자로한다

        // 여러 단어 이름은 단어의 첫글자를 대문자로 한다
        // 2) lastIndexOf,StringBuffer

        // 상수의 이름은 대문자로 한다. 단어는 '_' 로 구분한다
        // 3) PI , MAX_NUMBER

        // 변수, 상수, 리터럴

        // 변수(variable) : 하나의 값을 저장하기 위한 공간
        // 상수(Constant) : 한 번만 값을 저장할 수 있는 공간
        // 리터럴(Literal) : 그 자체로 값을 의미하는 것
        // int score = 100;
        //     score = 200;
        // char ch = 'A';
        // String str = "abc";
        // final int MAX = 100;
        // MAX = 200; // 에러, 상수의 값은 변경불가

        int max(int a, int b) {
            return a > b ? a: b;
        }

        (a,b) -> a ? b ? a : b


        int printVar(String name, int i) {
            System.out.println(name+ "=" +i);
        }

        (name, i) -> {
            System.out.println(name + "=" + i);
        }

        int square (int x) {
            return x * x;
        }

        () -> {return x};
}
