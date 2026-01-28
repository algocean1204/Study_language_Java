package com.aisamdasu.using_Java.J_01_ArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.zip.CheckedInputStream;

// 1. 배열로 구현

// 확장 for문에서 사용하기 위해 이터레이터로 만들어야됨
public class ArrayList<E> implements List<E> {

    private int size;
    private E[] dataArray;

    public ArrayList() {
        this.size = 0;
        resize();
    }
    private void resize() {
        if (size == 0){
            // 최초 10개의 방을 만들었음
            dataArray = (E[]) new Object[10];
        }
        else {
            // 배열을 추가로 확장하고,
            E[] newData = (E[]) new Object[size + 10];
            // 배열 카피
            // data 배열의 0 번째부터 newData 배열의 0번째 부터 size만큼 복제
            System.arraycopy(dataArray, 0, newData, 0, size);
            dataArray = newData;
        }
    }

    @Override
    public void add(E element) {
        if (size == dataArray.length) {
            resize();
        }
        dataArray[size++] = element;
    }

    @Override
    public void add(int index, E element) {
        // checkBoundInclusive 이용해서 검사
        checkBoundInclusive(index);
        // resize() 필요한지 검사
        if (size == dataArray.length) {
            resize();
        }
        // System.arrayCopy를 사용해서 index 지점부터 끝까지 밀기
        E[] newData = (E[]) new Object[dataArray.length];
        System.arraycopy(dataArray, 0, newData, 0, index);

        newData[index++] = element;

        System.arraycopy(dataArray, index, newData, index + 1, size - index);

        dataArray = newData;
        size++;

        /*
        더 간단한 코드
         */
        checkBoundInclusive(index);
        if (size == dataArray.length) {
            resize();
        }
        if(index != size) {
            System.arraycopy(dataArray, index, dataArray, index + 1, size - index);
        }
        dataArray[index] = element;
        size++;
    }

    // 오버플로우, 언더플로우 감지, 범위 포함
    private void checkBoundInclusive(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public E get(int index) {
        // 인덱스 주면됨, 인덱스 범위 나가는것만 체크해줌
        checkBoundExclusive(index);
        return  dataArray[index];
    }

    // 오버플로우, 언더플로우 감지, 범위 미포함
    private void checkBoundExclusive(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public E remove(int index) {
        checkBoundExclusive(index);
        E removed = dataArray[index];
        if(index != --size) {
            System.arraycopy(dataArray, index + 1, dataArray, index, size - index);
        }
        return removed;
    }

    @Override
    public void removeAll() {
        // for로 지울 필요 없음. 그냥 size 0 이면 됨
        size = 0;
    }

    @Override
    public int size() {
        // size 주면됨
        return size;
    }


    // iterator 구현
    @Override
    public Iterator<E> iterator() {
        // next와 hasnext만 있으면 됨
        return new Iterator<E>() {
            private int pos = 0;
            private int size = 0;


            @Override
            public boolean hasNext() {
                // 가져올 데이터가 있다는 의미의 True return
                return pos < size;
            }

            @Override
            public E next() {
                if(pos >= size) {
                    throw new NoSuchElementException();
                }
                // size보다 작으면 가져오면 됨 -> 가져오고 증가
                return dataArray[pos++];
            }
        };
    }
}
