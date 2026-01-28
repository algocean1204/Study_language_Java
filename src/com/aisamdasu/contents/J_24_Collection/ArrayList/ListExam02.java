package com.aisamdasu.contents.J_24_Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);
        for(int s: list){
            System.out.println(s);
        }
        System.out.println();

        // 레포 객체가 들어있다 생각하면 됨. 인덱스 말고, 값을 제거하기
        Integer a = 2;
        list.remove(a);
        for(int s: list){
            System.out.println(s);
        }
    }
}
