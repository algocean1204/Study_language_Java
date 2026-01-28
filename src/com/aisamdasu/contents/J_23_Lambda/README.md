# 람다식 (Lambda Expression)

## 정의
- 함수형 프로그래밍을 위한 문법
- 익명 함수를 간결하게 표현함
- Java 8부터 지원함

## 기본 문법
```java
// 기존 익명 클래스
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("실행");
    }
};

// 람다식
Runnable r = () -> System.out.println("실행");
```

## 형태
```java
(매개변수) -> { 실행문 }
(a, b) -> { return a + b; }
(a, b) -> a + b  // 단일 표현식은 중괄호, return 생략 가능
a -> a * 2       // 매개변수 1개면 괄호 생략 가능
```

## 함수형 인터페이스
- 추상 메서드가 1개인 인터페이스
- `@FunctionalInterface` 어노테이션 사용

## java.util.function 패키지
- `Function<T,R>`: T를 받아 R 반환
- `Consumer<T>`: T를 받아 소비 (반환 없음)
- `Supplier<T>`: T를 공급 (매개변수 없음)
- `Predicate<T>`: T를 받아 boolean 반환
- `Operator`: 동일 타입 연산

## 메서드 참조
```java
// 람다식
s -> s.getName()

// 메서드 참조
Student::getName
```
