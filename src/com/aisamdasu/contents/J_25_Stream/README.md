# Stream API

## 정의
- 컬렉션/배열의 요소를 하나씩 처리하는 반복자
- 람다식과 함께 사용함
- Java 8부터 지원함

## 스트림 생성
```java
// List에서 생성
List<String> list = List.of("서울", "부산");
Stream<String> stream = list.stream();

// 배열에서 생성
int[] arr = {1, 2, 3};
IntStream intStream = Arrays.stream(arr);
```

## 파이프라인 구조
- 중간 처리: filter, map, sorted, distinct 등
- 최종 처리: forEach, count, average, sum 등

```java
double avg = members.stream()
    .mapToInt(Member::getPoint)  // 중간 처리
    .average()                    // 최종 처리
    .getAsDouble();
```

## 주요 중간 처리 메서드
```java
// 필터링
stream.distinct()              // 중복 제거
stream.filter(n -> n > 10)     // 조건 필터

// 매핑
stream.map(s -> s.toUpperCase())   // 변환
stream.mapToInt(Member::getScore)  // int 변환
stream.flatMap(...)                // 평탄화

// 정렬
stream.sorted()                    // 오름차순
stream.sorted(Comparator.reverseOrder())  // 내림차순
```

## 최종 처리 메서드
```java
stream.forEach(System.out::println)  // 반복
stream.count()                       // 개수
stream.average()                     // 평균
stream.sum()                         // 합계
```

## 병렬 스트림
```java
// 일반 스트림
list.stream()

// 병렬 스트림 - 멀티코어 활용
list.parallelStream()
```
- 대용량 데이터에서 성능 향상 가능
- 단, 오버헤드로 오히려 느려질 수 있음
