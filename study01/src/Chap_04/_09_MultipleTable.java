package Chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {

        // 구구단
        // 2*1 = 2
        // 2*2 = 4
        // 이중for문을 이용한 구구단 만들기
            for (int i = 2; i < 10; i++) {
                for (int j = 1; j < 10 ; j++) {
                    System.out.println(i + " x " + j + " = " +(i * j));
                }
                System.out.println();

            }
        }
    }

