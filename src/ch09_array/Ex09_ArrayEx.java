package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int student = 0; // 학생수입력
        int score = 0; // 점수입력
        int logic = 0; // 분석
        int select = 0; //기능선택

        while (run) {
            System.out.println("-----------------------------------");
            System.out.println("1. 학생수입력 ㅣ 2.점수입력 ㅣ 3.분석ㅣ 4.종료 ");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");
            select = scan.nextInt();

            if (select == 1) {
                System.out.print("학생수> ");
            }


            if (select == 2) {
                // 학생수입력
                System.out.print("1번 학생 점수: ");
                student = scan.nextInt();
                student += student;
                System.out.print("2번 학생 점수: ");
                student = scan.nextInt();
                System.out.print("3번 학생 점수: ");
                student = scan.nextInt();

//여기까지 혼자 해본거!
            }


        }
    }
}

