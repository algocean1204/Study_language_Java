# 와일드카드 타입 파라미터

## 와일드카드 `?`
- 제네릭 타입을 매개변수로 받을 때 사용함
- 어떤 타입이든 받을 수 있음

## 종류

### 비제한 와일드카드
- `<?>`: 모든 타입 허용

```java
public static void register(Applicant<?> applicant) { }
```

### 상한 제한 와일드카드
- `<? extends 상위타입>`: 상위타입 및 하위타입만 허용

```java
// Student와 Student의 하위 클래스만 허용
public static void register(Applicant<? extends Student> applicant) { }
```

### 하한 제한 와일드카드
- `<? super 하위타입>`: 하위타입 및 상위타입만 허용

```java
// Worker와 Worker의 상위 클래스만 허용
public static void register(Applicant<? super Worker> applicant) { }
```

## 사용 예시
- 모든 사람 등록 가능: `Applicant<?>`
- 학생만 등록 가능: `Applicant<? extends Student>`
- 직장인 이상만 등록 가능: `Applicant<? super Worker>`
