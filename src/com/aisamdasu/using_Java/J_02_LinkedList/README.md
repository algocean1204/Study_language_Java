# 이중 연결 리스트 (Doubly Linked List) 직접 구현

## 학습 목표
- 노드 기반 리스트 자료구조 구현
- List 인터페이스의 6가지 메서드 구현

## 노드 구조
```java
private class Node<E> {
    private Node<E> next;  // 다음 노드
    private Node<E> prev;  // 이전 노드
    private E data;        // 데이터
}
```

## 핵심 필드
```java
private int size;      // 크기
private Node<E> head;  // 첫 번째 노드
private Node<E> tail;  // 마지막 노드
```

## 핵심 구현

### add (끝에 추가)
```java
Node<E> newNode = new Node<>(element);
if (head == null) {
    head = tail = newNode;
} else {
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
}
size++;
```

### add (특정 위치 삽입)
```java
// index 위치까지 이동
Node<E> x = head;
for (int i = 0; i < index; i++) {
    x = x.next;
}
// 노드 연결
x.prev.next = newNode;
newNode.prev = x.prev;
newNode.next = x;
x.prev = newNode;
```

### remove
```java
// 앞뒤 노드 연결
x.prev.next = x.next;
x.next.prev = x.prev;
size--;
return x.data;
```

## ArrayList vs LinkedList
| 항목 | ArrayList | LinkedList |
|------|-----------|------------|
| 구조 | 배열 | 노드 연결 |
| get | O(1) | O(n) |
| add (끝) | O(1) | O(1) |
| add (중간) | O(n) | O(n) |
| remove | O(n) | O(n) |
| 메모리 | 연속 | 분산 |
