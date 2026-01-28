package com.aisamdasu.using_Java.J_03_Stack;

import com.aisamdasu.using_Java.J_02_LinkedList.DLinkedList;

public class DLLStack<E> extends DLinkedList<E> {
    public DLLStack() {}

    public void push(E e) {
        add(e);
    }
    public E pop() {
        if(size() == 0){
            throw new StackException("Stack is empty");
        }
        // 연결리스트의 맨 마지막꺼 리턴
        return remove(size() - 1);
    }

    public E peek() {
        return get(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
