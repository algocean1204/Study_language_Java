# 병렬 스트림 (Parallel Stream)

## 정의
- 멀티코어 CPU를 활용한 병렬 처리
- 내부적으로 Fork/Join 프레임워크 사용함

## 생성 방법
```java
// 일반 스트림
list.stream()

// 병렬 스트림
list.parallelStream()

// 기존 스트림을 병렬로 변환
stream.parallel()
```

## 사용 예시
```java
List<Integer> scores = new ArrayList<>();
// 1억 개의 데이터 추가

// 일반 스트림
double avg1 = scores.stream()
    .mapToInt(i -> i.intValue())
    .average()
    .getAsDouble();

// 병렬 스트림
double avg2 = scores.parallelStream()
    .mapToInt(i -> i.intValue())
    .average()
    .getAsDouble();
```

## 주의사항
- 항상 빠른 것은 아님
- 데이터가 적으면 오버헤드로 오히려 느려질 수 있음
- 스레드 안전성 고려 필요함
