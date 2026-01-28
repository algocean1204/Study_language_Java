# Map 인터페이스

## 정의
- 키-값 쌍으로 데이터 저장
- 키는 중복 불가, 값은 중복 가능
- java.util 패키지에 존재함

## 구현 클래스
- `HashMap`: 해시 테이블 기반, 가장 많이 사용
- `TreeMap`: 키 기준 정렬
- `LinkedHashMap`: 삽입 순서 유지

## 주요 메서드
```java
Map<String, Integer> map = new HashMap<>();

// 추가
map.put("국어", 90);
map.put("수학", 40);

// 조회
map.get("국어");       // 90
map.size();            // 2

// 삭제
map.remove("국어");
map.clear();           // 전체 삭제
```

## 순회 방법

### keySet() 사용
```java
Set<String> keySet = map.keySet();
for(String key : keySet) {
    Integer value = map.get(key);
    System.out.println(key + ": " + value);
}
```

### entrySet() 사용
```java
Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
for(Map.Entry<String,Integer> entry : entrySet) {
    String key = entry.getKey();
    Integer value = entry.getValue();
    System.out.println(key + ": " + value);
}
```

### Iterator 사용
```java
Iterator<String> it = map.keySet().iterator();
while(it.hasNext()) {
    String key = it.next();
    Integer value = map.get(key);
}
```
