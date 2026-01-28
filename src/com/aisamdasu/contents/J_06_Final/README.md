# Final 키워드

## final 변수
- 값 변경 불가함
- 선언 시 또는 생성자에서 초기화 필수
- 상수 정의에 사용함 (static final)

```java
final int MAX_VALUE = 100;       // 선언 시 초기화
final String name;               // 생성자에서 초기화
```

## final 메서드
- 오버라이딩 불가함
- 자식 클래스에서 재정의 금지됨

```java
public final void print() {
    // 이 메서드는 오버라이딩 불가
}
```

## final 클래스
- 상속 불가함
- String, Integer 등이 대표적 final 클래스

```java
public final class Security {
    // 이 클래스는 상속 불가
}
```

## 상수 선언
- `static final` 조합 사용함
- 대문자와 언더스코어로 네이밍함

```java
public static final double PI = 3.14159;
public static final int MAX_COUNT = 1000;
```

## 사용 목적
- 불변성 보장
- 보안성 향상
- 실수 방지
