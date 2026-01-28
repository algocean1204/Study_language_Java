# 클래스와 메서드

## 클래스 구조
```java
public class 클래스명 {
    // 필드 (속성)
    String model;

    // 메서드 (기능)
    void drive() { }
}
```

## 객체 생성
- `new` 키워드로 인스턴스 생성함
- `클래스명 변수명 = new 클래스명();`

## 필드
- 클래스 내부에 선언된 변수
- 객체의 상태를 저장함
- 기본값: 숫자는 0, boolean은 false, 참조형은 null

## 메서드
- 객체의 동작을 정의함
- 반환타입, 메서드명, 매개변수로 구성됨
- `void`: 반환값 없음

## String 메서드
- `length()`: 문자열 길이
- `charAt(i)`: i번째 문자
- `substring(start, end)`: 부분 문자열
- `equals()`: 문자열 비교
- `toUpperCase()`, `toLowerCase()`: 대소문자 변환
- `split()`: 문자열 분리
- `trim()`: 앞뒤 공백 제거
