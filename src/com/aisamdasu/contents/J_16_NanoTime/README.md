# System.nanoTime()

## 정의
- 나노초 단위의 시간 측정
- 1나노초 = 10억분의 1초
- 실행 시간 측정에 사용함

## 사용법
```java
long start = System.nanoTime();

// 측정할 코드

long end = System.nanoTime();
long elapsed = end - start;  // 나노초 단위
```

## 시간 변환
```java
long nanos = end - start;
double millis = nanos / 1_000_000.0;   // 밀리초
double seconds = nanos / 1_000_000_000.0;  // 초
```

## currentTimeMillis()와 차이
| 구분 | nanoTime() | currentTimeMillis() |
|------|-----------|---------------------|
| 단위 | 나노초 | 밀리초 |
| 기준점 | 임의 | 1970-01-01 |
| 용도 | 경과 시간 측정 | 현재 시간 확인 |

## 주의사항
- nanoTime()의 절대값은 의미 없음
- 시작과 종료 시점의 차이만 유의미함
- 시스템에 따라 정밀도 다를 수 있음
