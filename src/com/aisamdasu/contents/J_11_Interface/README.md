# 인터페이스 (Interface)

## 정의
- `interface` 키워드로 선언함
- 클래스가 구현해야 할 동작 정의함
- 다중 구현 가능함

## 구성 요소
- 상수: `public static final` (자동 적용)
- 추상 메서드: `public abstract` (자동 적용)
- default 메서드: 구현 포함 (Java 8+)
- static 메서드: 정적 메서드 (Java 8+)
- private 메서드: 내부 구현용 (Java 9+)

```java
public interface Animal {
    int MAX_AGE = 100;              // 상수

    void sound();                   // 추상 메서드

    default void sleep() {          // default 메서드
        System.out.println("잠");
    }
}
```

## 구현
- `implements` 키워드 사용함
- 모든 추상 메서드 반드시 구현해야 함

```java
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
```

## 다중 구현
```java
public class Bird implements Animal, Flyable {
    // 두 인터페이스의 모든 메서드 구현
}
```

## 사용 목적
- 다형성 활용
- 느슨한 결합 (Loose Coupling)
- 다중 상속 효과
- 표준화된 개발
