# 제네릭 도입 배경

## Object 타입의 문제점
- 모든 타입을 저장할 수 있지만 꺼낼 때 형변환 필요함
- 잘못된 형변환 시 런타임 에러 발생함
- 컴파일 시점에 타입 오류 검출 불가함

## 예시
```java
ObjectPiggyBank bank = new ObjectPiggyBank();
bank.setMoney(1000);        // int -> Object (자동 형변환)
bank.setMoney(5.4);         // double -> Object (자동 형변환)

// 꺼낼 때 직접 형변환 필요
int money = (int) bank.getMoney();  // 위험! 실제로 double일 수 있음
```

## 문제점 정리
- 저장 시: 자동 형변환됨 (업캐스팅)
- 조회 시: 직접 형변환 필요함 (다운캐스팅)
- 타입 안정성 보장 안됨

## 해결책
- Generic 타입 사용 (J_14_Generic 참고)
