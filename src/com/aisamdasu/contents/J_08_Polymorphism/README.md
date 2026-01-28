# 다형성 (Polymorphism)

## 정의
- 하나의 타입으로 여러 객체를 참조하는 것
- 부모 타입 변수로 자식 객체 참조 가능함
- 코드 유연성과 확장성 향상됨

## 업캐스팅
- 자식 → 부모 타입으로 변환
- 자동 형변환됨

```java
Engine engine = new DieselEngine();  // 자동 업캐스팅
```

## 다운캐스팅
- 부모 → 자식 타입으로 변환
- 명시적 형변환 필요함
- `instanceof`로 타입 확인 권장함

```java
DieselEngine diesel = (DieselEngine) engine;  // 명시적 다운캐스팅
```

## instanceof 연산자
- 객체의 실제 타입 확인함
- 다운캐스팅 전 안전한 타입 체크에 사용함

```java
if (engine instanceof DieselEngine) {
    DieselEngine diesel = (DieselEngine) engine;
}
```

## 활용
- 메서드 매개변수의 다형성
- 배열/컬렉션에서의 다형성
- 인터페이스 기반 프로그래밍

```java
void start(Engine engine) {
    engine.run();  // 어떤 엔진이든 동작
}
```
