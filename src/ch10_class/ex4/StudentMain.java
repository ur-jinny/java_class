package ch10_class.ex4;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        // 가본생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentNumber = "1111111";
        student1.studentMajor = "통계학";
        System.out.println("student1.studentName = " + student1.studentName);

        // 매개변수 있는 생성자로 student2 객체 생성
        Student student2 = new Student("이름2", "전화번호", "전공");
        System.out.println("student2.studentName = " + student2.studentName);

    }

}
