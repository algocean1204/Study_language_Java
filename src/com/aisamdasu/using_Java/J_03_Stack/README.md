# 스택 (Stack) 직접 구현

## ADT 정의
```java
void push(E e)      // 삽입
E pop()             // 삭제 및 반환
E peek()            // 조회 (삭제 없음)
boolean isEmpty()   // 비어있는지 확인
```

## 구현 방식
- 연결리스트(DLinkedList) 기반 스택
- LIFO (Last In First Out)

```java
public class DLLStack<E> extends DLinkedList<E> {
    public void push(E e) {
        add(e);  // 끝에 추가
    }
    public E pop() {
        return remove(size() - 1);  // 끝에서 제거
    }
    public E peek() {
        return get(size() - 1);  // 끝 조회
    }
}
```

## 스택 활용 예제

### step2 - 괄호 검사
- 여는 괄호: push
- 닫는 괄호: pop 후 짝 비교
- 스택이 비어있으면 유효

### step3 - 중위 → 후위 변환
```
중위: 3 + 2 * 4
후위: 3 2 4 * +
```
- 피연산자: 바로 출력
- 연산자: 우선순위 비교 후 push/pop

### step4 - 후위 표기식 계산
```
324*+ 계산:
1. 3 push
2. 2 push
3. 4 push
4. * → pop 2개 (4,2) → 8 push
5. + → pop 2개 (8,3) → 11 push
결과: 11
```

## 시간 복잡도
| 연산 | 복잡도 |
|------|--------|
| push | O(1) |
| pop | O(1) |
| peek | O(1) |
