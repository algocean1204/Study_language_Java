# StringTokenizer

## 정의
- 문자열을 구분자로 분리하는 클래스
- java.util 패키지에 존재함
- 토큰 단위로 문자열 처리함

## 생성자
```java
// 기본 구분자(공백, 탭, 줄바꿈)
StringTokenizer st = new StringTokenizer("a b c");

// 지정 구분자
StringTokenizer st = new StringTokenizer("a,b,c", ",");

// 구분자도 토큰으로 포함
StringTokenizer st = new StringTokenizer("a,b,c", ",", true);
```

## 주요 메서드
- `hasMoreTokens()`: 토큰 존재 여부
- `nextToken()`: 다음 토큰 반환
- `countTokens()`: 남은 토큰 개수

## 사용 예시
```java
StringTokenizer st = new StringTokenizer("Java,Python,C++", ",");

while (st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}
// 출력: Java Python C++
```

## String.split()과 비교
| 구분 | StringTokenizer | split() |
|------|----------------|---------|
| 반환 | 열거형 | 배열 |
| 빈 문자열 | 무시 | 포함 |
| 정규식 | 미지원 | 지원 |

## 권장 사항
- 간단한 분리: split() 사용
- 성능 중요: StringTokenizer 사용
