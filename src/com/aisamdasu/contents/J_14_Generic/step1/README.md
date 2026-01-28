# 멀티 타입 파라미터와 제네릭 메서드

## 멀티 타입 파라미터
- 두 개 이상의 타입 파라미터 사용 가능함
- 콤마로 구분하여 선언함

```java
public class Pair<K, V> {
    private K key;
    private V value;
}
```

## 제네릭 메서드
- 메서드 선언부에 타입 파라미터 정의함
- 반환타입 앞에 `<K, V>` 형태로 선언함
- static 메서드에서도 사용 가능함

```java
public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
    return p1.getKey().equals(p2.getKey());
}
```

## 호출 방법
```java
// 명시적 타입 지정
Util.<String, Integer>compare(p1, p2);

// 타입 추론 (컴파일러가 추론)
Util.compare(p1, p2);
```
