# toString 메서드

## Object의 toString()
- 모든 클래스는 Object를 상속함
- 기본 반환: `클래스명@해시코드`
- 객체 정보를 문자열로 반환함

## 오버라이딩 목적
- 객체의 의미있는 정보 출력
- 디버깅 용이함
- System.out.println()에서 자동 호출됨

## 예시
```java
public class SmartPhone {
    private String company;
    private String os;

    @Override
    public String toString() {
        return company + ", " + os;
    }
}

// 사용
SmartPhone phone = new SmartPhone("Samsung", "Android");
System.out.println(phone);  // toString() 자동 호출
```

## 자동 호출되는 경우
- `System.out.println(객체)`
- 문자열 연결: `"객체: " + 객체`
- `String.valueOf(객체)`

## 주의사항
- 순환 참조 시 StackOverflowError 발생 가능함
- null 체크 필요할 수 있음
- IDE의 자동 생성 기능 활용 권장함
