package com.aisamdasu.using_Java.J_02_LinkedList;


public class MyDLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new DLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list.size());

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
