# 응용 문제 - 문자열 파싱과 2차원 배열

## 학습 내용
- 문자열 split() 메서드 활용
- 2차원 배열 동적 생성
- 문자열 → 숫자 변환 (Double.parseDouble)

## 문제 설명
토양 샘플 분석 프로그램 작성
- 첫 번째 인자: 성분 이름 (쉼표 구분)
- 두 번째 인자: 성분 함량 (2차원 데이터)

## 핵심 메서드

### 1차원 파싱
```java
public static String[] getElements(String input) {
    return input.split(",");
}
```

### 2차원 파싱
```java
public static double[][] getSamples(String input) {
    String[] rows = input.split(">");
    double[][] result = new double[rows.length][];

    for (int i = 0; i < rows.length; i++) {
        String[] cols = rows[i].split(",");
        result[i] = new double[cols.length];
        for (int j = 0; j < cols.length; j++) {
            result[i][j] = Double.parseDouble(cols[j]);
        }
    }
    return result;
}
```

## 사용된 개념
- `String.split()`: 구분자로 문자열 분리
- `Double.parseDouble()`: 문자열을 double로 변환
- 가변 길이 2차원 배열: `new double[rows.length][]`
