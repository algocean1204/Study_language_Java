# StringBuilder

## 정의
- 가변(mutable) 문자열 클래스
- 문자열을 자주 수정하는 경우 사용함
- String보다 성능 우수함

## String vs StringBuilder
- String: 불변 객체, 수정 시 새 객체 생성됨
- StringBuilder: 가변 객체, 내부 배열 수정됨

```java
// String (비효율적)
String s = "";
for (int i = 0; i < 1000; i++) {
    s += i;  // 매번 새 객체 생성
}

// StringBuilder (효율적)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);  // 내부 버퍼 수정
}
```

## 주요 메서드
- `append(값)`: 문자열 끝에 추가
- `insert(위치, 값)`: 지정 위치에 삽입
- `delete(시작, 끝)`: 범위 삭제
- `replace(시작, 끝, 문자열)`: 범위 교체
- `reverse()`: 문자열 뒤집기
- `toString()`: String으로 변환

## StringBuffer와 차이
- StringBuilder: 단일 스레드 환경 (비동기)
- StringBuffer: 멀티 스레드 환경 (동기화)
- 성능: StringBuilder > StringBuffer
