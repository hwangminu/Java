package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"카푸치노", "카페모카", "라떼", "카푸치노" };

        // for 반복문 순회
        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");

        // enhanced for ( for -each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");

        // 일반 for 문은 index 값을 제한하고싶을때 사용하면 된다
    }
}
