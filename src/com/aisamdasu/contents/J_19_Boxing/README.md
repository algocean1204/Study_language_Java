# Boxing과 Unboxing

## 정의
- **Boxing**: 기본형 → Wrapper 클래스 변환
- **Unboxing**: Wrapper 클래스 → 기본형 변환

## Wrapper 클래스
| 기본형 | Wrapper |
|-------|---------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

## 수동 변환
```java
// Boxing
Integer num = Integer.valueOf(10);

// Unboxing
int n = num.intValue();
```

## Auto Boxing/Unboxing (Java 5+)
- 컴파일러가 자동 변환함

```java
// Auto Boxing
Integer num = 10;  // Integer.valueOf(10)

// Auto Unboxing
int n = num;  // num.intValue()
```

## 주의사항
- null 언박싱 시 NullPointerException 발생함
- 성능: 기본형이 Wrapper보다 빠름
- 비교: ==는 참조 비교, equals()로 값 비교

```java
Integer a = 127;
Integer b = 127;
System.out.println(a == b);  // true (캐싱)

Integer c = 128;
Integer d = 128;
System.out.println(c == d);  // false
System.out.println(c.equals(d));  // true
```

## Integer 캐싱
- -128 ~ 127 범위는 캐싱됨
- 같은 값이면 같은 객체 참조함
