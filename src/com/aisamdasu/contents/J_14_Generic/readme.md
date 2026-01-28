# Generic 타입

## 정의
- J_13의 Object 타입 형변환 문제를 보완하기 위해 사용함
- 컴파일 단계에서 강한 타입 체킹 가능함
- 코드 재사용성이 높아짐

## 제네릭 클래스
```java
public class GenericPiggyBank<T> {
    private T money;

    public void setMoney(T money) {
        this.money = money;
    }

    public T getMoney() {
        return money;
    }
}
```

## 사용법
```java
GenericPiggyBank<Integer> intBank = new GenericPiggyBank<>();
intBank.setMoney(1000);
int money = intBank.getMoney();  // 형변환 불필요

GenericPiggyBank<Double> doubleBank = new GenericPiggyBank<>();
doubleBank.setMoney(5.4);
double money2 = doubleBank.getMoney();  // 형변환 불필요
```

## 타입 파라미터 관례
- `T`: Type
- `E`: Element
- `K`: Key
- `V`: Value
- `N`: Number

## 제네릭 메서드
- 메서드 단위로 타입 파라미터 선언 가능함
- `<T> T method(T param)` 형태로 선언함
