package ch11_array;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Ex01_ListBasic {

    public static void main(String[] args) {
        //  정수를 담는 intList 선언
        List<Integer> intList = new ArrayList<>(); // 이것이 문법. (arrayList)를 사용할 때는 이 문법을 사용한다.
//        ArrayList<Integer> intList2 = new ArrayList<>();
//        List<Integer> intList3 = new List<>(); // X
        // 10 이라는 데이터 추가
        intList.add(10); // add는 메서드!
        intList.add(10000);
        // 1번 인덱스에 999를 추가
        intList.add(1, 999); //새치키 느낌
        System.out.println("intList.size() = " + intList.size()); //intList.size는 배열의 크기!
        // 0 번 인덱스에 담긴 데이터 출력
        System.out.println("inList.get(0) = " + intList.get(0)); // 배열 0 번째 값이 출력
        System.out.println("inList.get(1) = " + intList.get(1)); // 배열 1 번쨰 칸이 원래는 1000인데 추가를 더하니까 새치기 당해사 999
        System.out.println("inList.get(2) = " + intList.get(2)); // 배열 2 번째 칸이 밀려놔서 1000이 출력


        // remove()
        intList.remove(1);
        System.out.println("inList.get(0) = " + intList.get(0));
        System.out.println("inList.get(1) = " + intList.get(1));
//        System.out.println("inList.get(2) = " + intList.get(2));

        // String 을 담는 strList 선언
        List<String> strList = new ArrayList<>();
        strList.add("안녕");
        strList.add(1, "hello");
        System.out.println("strList.get(0)) = " + strList.get(0));
        System.out.println("strList.get(1)) = " + strList.get(1));
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);

        // for 문을 이용하여 intList 에 담긴 데이터를 모두 출력
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("inList.get(0) = " + intList.get(i));
        }

        // for each
        for(int a: intList)  {  // for(Integer a: intList) 를 써도 가능.
            System.out.println("a = " + a);
        }


        // 이 문법도 가능하다.
//        intList.forEach(i->  {
//                    System.out.println("i = " + i);
//                });

        // for 문을 이용하여 strList 에 담기 데이터를 모두 출력
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList.get(0) = " + strList.get(i));



            //  for each
            for (String bb: strList) {
                System.out.println("bb = " + bb);
            }
//11
            strList.forEach(bb->  {
                System.out.println("bb = " + bb);
            });

        }
    }
}


