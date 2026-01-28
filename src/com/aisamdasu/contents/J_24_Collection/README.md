# Java Collection Framework

## 정의
- 자료구조를 미리 구현해둔 라이브러리
- java.util 패키지에 포함됨

## 주요 인터페이스

### List
- 순서 있음, 중복 허용
- `ArrayList`: 배열 기반, 조회 빠름
- `LinkedList`: 노드 기반, 삽입/삭제 빠름
- `Vector`: 동기화 지원 (멀티스레드용)

### Set
- 순서 없음, 중복 불허
- `HashSet`: 해시 테이블 기반
- `TreeSet`: 정렬된 순서 유지
- `LinkedHashSet`: 삽입 순서 유지

### Map
- 키-값 쌍으로 저장
- `HashMap`: 해시 테이블 기반
- `TreeMap`: 키 기준 정렬
- `LinkedHashMap`: 삽입 순서 유지

## List 주요 메서드
```java
list.add("값");       // 추가
list.get(0);          // 조회
list.remove(0);       // 인덱스로 삭제
list.remove("값");    // 값으로 삭제
list.size();          // 크기
list.contains("값");  // 포함 여부
```

## 순회 방법
```java
// for-each
for(String s : list) { }

// Iterator
Iterator<String> it = list.iterator();
while(it.hasNext()) {
    String s = it.next();
}
```
