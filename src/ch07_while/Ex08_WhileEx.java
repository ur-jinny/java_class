package ch07_while;

import com.sun.source.tree.IfTree;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        /**
         *  1.예금 | 2.출금 | 3.잔고 | 4.종료
         *  ------------------------------------
         *  선택>1
         *  예금액>10000
         *  현재잔액은 10000입니다.
         *  ------------------------------------
         *  1.예금 | 2.출금 | 3.잔고 | 4.종료
         *  ------------------------------------
         *  선택> 2
         *  출금액>20,000
         *  잔고가 부족합니다.
         *  현재잔액은 10000입니다.
         */

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        // 변수값이 세개가 필요함. 예금, 출금, 잔고금액을 알아야하니까---> 변수값을 초기화하고 변수선언.
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;


        while(run){
            System.out.println("-----------------------------------");
            System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료 ");
            System.out.println("-----------------------------------");
            break;



//            boolean run = true;
//            int balance = 0; // 잔고
//            int deposit = 0; // 입금액
//            int withdraw = 0; // 출금액
//            int select = 0; // 기능선택
//            Scanner scan = new Scanner(System.in); // Scanner 클래스타입의 변수 scan
//
//            while (run) {
//                System.out.println("-------------------------------------");
//                System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//                System.out.println("-------------------------------------");
//                System.out.print("선택> ");
//                select = scan.nextInt();
//                if (select == 1) {
//                    // 예금
//                    System.out.print("예금액>");
//                    deposit = scan.nextInt();
//                    balance += deposit;
//                    System.out.println("입금이 완료되었습니다.");
//                    System.out.println("현재잔액은 " + balance + "원 입니다.");
//                } else if (select == 2) {
//                    // 출금
//                    System.out.print("출금액>");
//                    withdraw = scan.nextInt();
//                    if (withdraw > balance) {
//                        System.out.println("잔고가 부족합니다.");
//                        System.out.println("현재잔액은 " + balance + "원 입니다.");
//                    } else {
//                        // withdraw >= balance
//                        balance -= withdraw;
//                        System.out.println("출금이 완료되었습니다.");
//                        System.out.println("현재잔액은 " + balance + "원 입니다.");
//                    }
//                } else if (select == 3) {
//                    // 잔고
//                    System.out.println("현재잔액은 " + balance + "원 입니다.");
//                } else if (select == 4) {
//                    // 종료
//                    run = false;
//                    System.out.println("종료합니다. 이용해주셔서 감사합니다.");
//                } else {
//                    // 잘못된 선택
//                    System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
//                }

//            // switch case로 구현한 내용
//            switch (select) {
//                case 1:
//                    // 예금
//                    System.out.print("예금액>");
//                    deposit = scan.nextInt();
//                    balance += deposit;
//                    System.out.println("입금이 완료되었습니다.");
//                    System.out.println("현재잔액은 " + balance + "원 입니다.");
//                    break;
//                case 2:
//                    // 출금
//                    System.out.print("출금액>");
//                    withdraw = scan.nextInt();
//                    if (withdraw > balance) {
//                        System.out.println("잔고가 부족합니다.");
//                        System.out.println("현재잔액은 " + balance + "원 입니다.");
//                    } else {
//                        // withdraw >= balance
//                        balance -= withdraw;
//                        System.out.println("출금이 완료되었습니다.");
//                        System.out.println("현재잔액은 " + balance + "원 입니다.");
//                    }
//                    break;
//                case 3:
//                    // 잔고
//                    System.out.println("현재잔액은 " + balance + "원 입니다.");
//                    break;
//                case 4:
//                    // 종료
//                    run = false;
//                    System.out.println("종료합니다. 이용해주셔서 감사합니다.");
//                    break;
//                default:
//                    // 잘못된 선택
//                    System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
//                    break;
//
//            }

            }
        }
    }
















