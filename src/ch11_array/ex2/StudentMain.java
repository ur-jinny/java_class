package ch11_array.ex2;

import ch11_array.ex2.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체를 담기 위한 List
        // studentList

        List<Student> studentList = new ArrayList<>();
//        studentList.add(12); // X
        String studenrName = "학생1";
//    studentList.add(studentName); // X
        Student student1 = new Student(1L, "학생1", "20231111", "현대무용", "010-1111-1111");
        // studentList 추가
        studentList.add(student1);
        Student student2 =new Student(2L, "학생2", "20232222","사회과학", "010-2222-2222");
        studentList.add(student2);


        System.out.println("studentList = " + studentList.get(0));
        System.out.println("studentList = " + studentList.get(1));

        Student a = studentList.get(0);
        System.out.println("a = : + a");
        System.out.println(a.getStudentName());

        // 1번 인덱스에 담긴 객체의 학과만 출력
        System.out.println(studentList.get(1).getStudentMajor()); // 먼저 리스트에 접근 그리고 객체에 접근하고


        // 반복문
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("studentList = " + studentList.get(i));
            // 학생의 이름만 따로 출력
            System.out.println("studentList = " + studentList.get(i).getStudentName());
        }

        // for each
        for (Student stu: studentList) {
            System.out.println("stu = " + stu);

            //이름만
            System.out.println("stu.getStudentName() = " + stu.getStudentName());
        }

    }
}
