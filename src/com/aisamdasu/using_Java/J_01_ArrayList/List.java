package com.aisamdasu.using_Java.J_01_ArrayList;

// 확장 for문을 사용하기 위해 Iterable<> 인터페이스를 상속받아야함
public interface List<E> extends Iterable<E> {
    void add(E e);
    void add(int index, E e);
    E get(int index);
    E remove(int index);
    void removeAll();
    int size();
}
