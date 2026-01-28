# 중첩 클래스와 익명 클래스

## 중첩 클래스 (Nested Class)
- 클래스 내부에 정의된 클래스
- 외부 클래스와 밀접한 관계일 때 사용함

### 종류
1. **정적 중첩 클래스**: static 키워드 사용
2. **인스턴스 멤버 클래스**: static 없이 선언
3. **로컬 클래스**: 메서드 내부에 선언

### 정적 중첩 클래스
```java
public class Outer {
    static class StaticNested {
        // 외부 클래스의 static 멤버만 접근 가능
    }
}
// 사용: Outer.StaticNested nested = new Outer.StaticNested();
```

### 인스턴스 멤버 클래스
```java
public class Outer {
    class Inner {
        // 외부 클래스의 모든 멤버 접근 가능
    }
}
// 사용: Outer outer = new Outer();
//       Outer.Inner inner = outer.new Inner();
```

## 익명 클래스 (Anonymous Class)
- 이름 없이 선언과 동시에 객체 생성함
- 일회성 사용 시 유용함
- 인터페이스나 추상 클래스의 즉석 구현에 사용함

```java
Engine engine = new Engine() {
    @Override
    public void start() {
        System.out.println("익명 엔진 시동");
    }
};
```

## 사용 목적
- 코드 캡슐화
- 논리적 그룹화
- 가독성 향상
- 람다 표현식의 기반 (Java 8+)
