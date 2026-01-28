# 열거 타입 (Enum)

## 정의
- 관련 있는 상수들의 집합을 표현
- 클래스의 멤버가 상수만 있을 경우 사용
- 타입 안전성 보장함

## 기존 상수 정의 방식의 문제
```java
// 인터페이스 상수 (타입 체크 불가)
public interface Day {
    int MONDAY = 1;
    int TUESDAY = 2;
}
```

## enum 선언
```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

## 사용 방법
```java
Day today = Day.MONDAY;

// switch문 활용
switch(today) {
    case MONDAY: break;
    case TUESDAY: break;
}
```

## 필드와 메서드 추가
```java
public enum TrafficLight {
    RED("정지"), GREEN("직진"), ARROW("좌회전");

    private String command;

    private TrafficLight() {}
    private TrafficLight(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
```

## 주요 메서드
- `name()`: 상수 이름 반환
- `ordinal()`: 순서 반환 (0부터)
- `values()`: 모든 상수 배열 반환
- `valueOf("상수명")`: 문자열로 상수 획득

## 특징
- enum은 내부적으로 클래스임
- 각 상수는 해당 enum 타입의 객체임
- 생성자는 private만 가능함
- enum으로 싱글톤 구현 가능함
