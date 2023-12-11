package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int selectNo = 0;

        int[] scores = null; // scores라는 배열 이름만 선언

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();

            if (selectNo == 1) {
                // 학생수 입력 받고 해당 수 크기를 갖는 배열로 선언
                System.out.print("학생수>");
                studentNum = scan.nextInt();
                // 입력받은 학생수만큼의 크기를 갖는 배열 객체로 선언(new)
                scores = new int[studentNum];
            } else if (selectNo == 2) {
                // 배열에 점수 데이터 저장
                for (int i = 0; i < scores.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수: ");
                    scores[i] = scan.nextInt();
                }
            } else if (selectNo == 3) {
                // 저장된 데이터 출력
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수: " + scores[i]);
                }
            } else if (selectNo == 4) {
                // 최댓값, 평균값 계산 및 출력
                int sum = 0, max = 0;
                double avg = 0.0;
                for (int i = 0; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                avg = sum / scores.length;
                avg = (double) sum / scores.length;
                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + avg);

                // 내림차순 정렬 및 출력
                int temp = 0;
                for (int i = 0; i < scores.length; i++) {
                    for (int j = i + 1; j < scores.length; j++) {
                        if (scores[i] < scores[j]) {
                            temp = scores[i];                // temp 라는 임시 저장소가 필요했다.
                            scores[i] = scores[j];           // 오름차순과 내림차순 기호만 다름 //프로세스 과정은 똑같음.
                            scores[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "등: " + scores[i]);
                }
            } else if (selectNo == 5) {
                // 종료
                run = false;
//        Scanner scan = new Scanner(System.in);
//        boolean run = true;
//        int student = 0; // 학생수입력
//        int score = 0; // 점수입력
//        int logic = 0; // 분석
//        int select = 0; //기능선택
//
//        while (run) {
//            System.out.println("-----------------------------------");
//            System.out.println("1. 학생수입력 ㅣ 2.점수입력 ㅣ 3.분석ㅣ 4.종료 ");
//            System.out.println("-----------------------------------");
//            System.out.print("선택> ");
//            select = scan.nextInt();
//
//            if (select == 1) {
//                // 학생수 입력 받고 해당 수 크기를 갖는 배열로 선언
//
//            }
//
//
//            if (select == 2) {
//                // 학생수입력
//                System.out.print("1번 학생 점수: ");
//                student = scan.nextInt();
//                student += student;
//                System.out.print("2번 학생 점수: ");
//                student = scan.nextInt();
//                System.out.print("3번 학생 점수: ");
//                student = scan.nextInt();

//여기까지 혼자 해본거!
            }


        }
    }
}

