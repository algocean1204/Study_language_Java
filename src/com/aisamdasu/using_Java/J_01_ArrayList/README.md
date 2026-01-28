# ArrayList 직접 구현

## 학습 목표
- 배열 기반 리스트 자료구조 구현
- List 인터페이스의 6가지 메서드 구현

## List 인터페이스
```java
public interface List<E> extends Iterable<E> {
    void add(E e);           // 끝에 추가
    void add(int index, E e); // 특정 위치에 추가
    E get(int index);        // 조회
    E remove(int index);     // 삭제
    void removeAll();        // 전체 삭제
    int size();              // 크기
}
```

## 핵심 구현

### 동적 배열 확장 (resize)
```java
private void resize() {
    if (size == 0) {
        dataArray = (E[]) new Object[10];  // 초기 10칸
    } else {
        E[] newData = (E[]) new Object[size + 10];
        System.arraycopy(dataArray, 0, newData, 0, size);
        dataArray = newData;
    }
}
```

### add (특정 위치 삽입)
```java
// index 위치부터 뒤로 한 칸씩 밀기
System.arraycopy(dataArray, index, dataArray, index + 1, size - index);
dataArray[index] = element;
size++;
```

### remove
```java
E removed = dataArray[index];
// index+1부터 앞으로 한 칸씩 당기기
System.arraycopy(dataArray, index + 1, dataArray, index, size - index);
return removed;
```

## Iterator 구현
- `Iterable<E>` 상속으로 확장 for문 사용 가능
- `hasNext()`: pos < size 여부 반환
- `next()`: dataArray[pos++] 반환

## 시간 복잡도
| 연산 | 복잡도 |
|------|--------|
| add (끝) | O(1) |
| add (중간) | O(n) |
| get | O(1) |
| remove | O(n) |
