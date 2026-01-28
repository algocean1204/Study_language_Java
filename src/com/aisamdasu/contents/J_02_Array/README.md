# 배열

## 1차원 배열
- 선언: `int[] arr;` 또는 `int arr[];`
- 생성: `new int[크기]`
- 초기화: `{값1, 값2, 값3}`
- 길이: `arr.length`

## 배열 선언 방식
```java
int[] scores = {100, 90, 85};           // 선언과 동시에 초기화
int[] scores = new int[]{100, 90, 85};  // new 키워드 사용
int[] scores = new int[3];              // 크기만 지정 (기본값 0)
```

## 2차원 배열
- 선언: `int[][] arr = new int[행][열];`
- 가변 배열: `int[][] arr = new int[3][];`

## 배열 순회
```java
// 일반 for문
for(int i = 0; i < arr.length; i++) { }

// 향상된 for문
for(int value : arr) { }
```

## 특징
- 인덱스는 0부터 시작함
- 크기 변경 불가함
- ArrayIndexOutOfBoundsException: 범위 초과 접근 시 발생
