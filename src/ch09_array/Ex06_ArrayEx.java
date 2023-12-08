package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("출력: ");
//        int[] numbers1 = new int[5];
//        int large = 0;
//
//        for (int i = 0; i < numbers1.length; i++) {
//            numbers1[i] = scanner.nextInt(); // i가 왜 있는가 (순서)-어디 칸에 대입..
//           //
        Scanner scanner = new Scanner(System.in);//
        int[] numbers = new int[5]; //크기가 5인 정수형 배열 선언
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            // 배열에 값 저장
            numbers[i] = scanner.nextInt();
            // 입력 값 중 최댓값 구하기
            if(max < numbers[i])     // 처음 max = 입력값
               max = numbers[i];     // 다른 Max값 입력값 비교 후 입력값이 더크면
                                     // Max는 입력값이 그렇지 않은 경우 기존 MAX 그대로 성립.
        }
        System.out.println("가장 큰 숫자는 " + max + "입니다");
    }
}


