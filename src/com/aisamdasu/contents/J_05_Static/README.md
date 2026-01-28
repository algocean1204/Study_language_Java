# Static 키워드

## static 필드
- 클래스 레벨의 변수 (클래스 변수)
- 모든 인스턴스가 공유함
- 객체 생성 없이 클래스명으로 접근 가능함
- `클래스명.필드명`

## static 메서드
- 클래스 레벨의 메서드
- 객체 생성 없이 호출 가능함
- `클래스명.메서드명()`
- 인스턴스 필드/메서드 직접 접근 불가함
- this 키워드 사용 불가함

## 활용 예시
```java
public class Robot {
    private String name;           // 인스턴스 필드
    private static int population; // 정적 필드

    public Robot(String name) {
        this.name = name;
        population++;  // 로봇 생성 시 개체수 증가
    }

    public static int getPopulation() {
        return population;
    }
}
```

## 메모리 구조
- static 멤버: Method Area에 저장됨
- 인스턴스 멤버: Heap에 저장됨
- 클래스 로딩 시 static 멤버 메모리 할당됨

## 사용 시점
- 모든 인스턴스가 공유해야 하는 데이터
- 유틸리티 메서드 (Math.random(), Integer.parseInt())
- 상수 정의 (static final)
