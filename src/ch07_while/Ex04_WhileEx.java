package ch07_while;

public class Ex04_WhileEx {


    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~6이 나오는 주사위를 설정하고
         * 주사위가 계속 던져지면서 6이 나오면 종료되는 코드 작성
         */
    boolean dice = true;
        while(dice){
            int i = ((int)(Math.random() * 6)+1);
            System.out.println(i);
            if(i == 6) {
                dice = false;
            }

        }


    }

}
