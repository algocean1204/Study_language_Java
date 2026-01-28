package com.aisamdasu.contents.J_14_Generic.step1;

public class Pair <K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        super(); // Object 클래스 상속받음, 생략 가능
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}
