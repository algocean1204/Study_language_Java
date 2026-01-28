# 싱글톤 패턴 (Singleton Pattern)

## 정의
- 프로그램 전체에서 객체가 딱 1개만 존재하도록 보장하는 패턴
- 추가 객체 생성을 막음

## 구현 방법
```java
public class Singleton {
    // 1. private static으로 자기 자신의 인스턴스 생성
    private static Singleton singleton = new Singleton();

    // 2. 생성자를 private으로 막음
    private Singleton() {}

    // 3. 외부에서 인스턴스를 얻는 메서드 제공
    public static Singleton getInstance() {
        return singleton;
    }
}
```

## 사용 예시
```java
Singleton s1 = Singleton.getInstance();
Singleton s2 = Singleton.getInstance();
// s1 == s2 (같은 객체)
```

## 특징
- `new`로 생성 불가 (생성자가 private)
- `getInstance()`로만 객체 획득
- 항상 동일한 객체 반환함

## 사용 사례
- 데이터베이스 연결 객체
- 설정 정보 관리 객체
- 로그 관리 객체
