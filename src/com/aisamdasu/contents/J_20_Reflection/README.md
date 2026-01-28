# 리플렉션 (Reflection)

## 메타정보
- 패키지 정보, 타입 정보, 멤버(생성자, 필드, 메서드) 정보

## 리플렉션 정의
- 메타 정보를 프로그램에서 읽고 수정하는 행위
- 런타임에 클래스 구조 분석함
- java.lang.reflect 패키지 사용함

## Class 객체 얻기
```java
// 방법 1: 클래스명.class
Class<?> clazz = Car.class;

// 방법 2: 객체.getClass()
Car car = new Car();
Class<?> clazz = car.getClass();

// 방법 3: Class.forName()
Class<?> clazz = Class.forName("com.example.Car");
```

## 주요 기능
- 클래스 정보 조회
- 생성자/필드/메서드 정보 조회
- 동적 객체 생성
- private 멤버 접근

## 활용 예시
```java
Class<?> clazz = Car.class;

// 클래스명
String name = clazz.getName();

// 필드 목록
Field[] fields = clazz.getDeclaredFields();

// 메서드 목록
Method[] methods = clazz.getDeclaredMethods();

// 생성자 목록
Constructor<?>[] constructors = clazz.getDeclaredConstructors();
```

## 사용 사례
- 프레임워크 개발 (Spring, JPA)
- 의존성 주입 (DI)
- 테스트 도구
- JSON/XML 직렬화
