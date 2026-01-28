# 추상 클래스 (Abstract Class)

## 정의
- `abstract` 키워드로 선언함
- 하나 이상의 추상 메서드 포함 가능함
- 직접 인스턴스 생성 불가함
- 상속을 통해서만 사용됨

## 추상 메서드
- 선언만 있고 구현부 없음
- 자식 클래스에서 반드시 구현해야 함

```java
public abstract class Engine {
    public abstract void start();  // 추상 메서드

    public void stop() {           // 일반 메서드
        System.out.println("정지");
    }
}
```

## 구현
```java
public class DieselEngine extends Engine {
    @Override
    public void start() {
        System.out.println("디젤 엔진 시동");
    }
}
```

## 특징
- 일반 메서드도 포함 가능함
- 생성자 가질 수 있음 (자식에서 호출)
- 필드 가질 수 있음

## 추상 클래스 vs 인터페이스
| 구분 | 추상 클래스 | 인터페이스 |
|------|-----------|-----------|
| 다중 상속 | 불가 | 가능 |
| 필드 | 가능 | 상수만 |
| 생성자 | 가능 | 불가 |
| 메서드 | 일반+추상 | 추상(+default) |

## 사용 시점
- 관련 클래스간 공통 기능 제공 시
- 일부 구현 공유하면서 하위 클래스 확장 시
