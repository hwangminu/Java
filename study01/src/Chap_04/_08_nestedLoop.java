package Chap_04;

public class _08_nestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기


        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println("--------------------");



        // * 왼쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            //for (int j = 0; j < i + 1; j++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------");


        // 오른쪽으로 별 찍기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }   // end of main
}   // end of class

