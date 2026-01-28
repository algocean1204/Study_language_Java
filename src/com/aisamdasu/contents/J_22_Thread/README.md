# 프로세스와 쓰레드

## 프로세스
- OS가 실행하는 프로그램의 인스턴스
- 하나 이상의 쓰레드로 구성됨
- 프로세스간 통신을 위해 IPC 사용함
- 현재 OS들은 모두 멀티 태스킹 지원함

## 쓰레드
- 프로세스 내에서 실행되는 흐름의 단위
- 프로세스는 다수의 쓰레드로 구성됨
- 각 쓰레드는 개별 Stack을 가짐
- Code, Data, Heap은 공유함
- IPC 없이도 데이터 공유 가능함

## 쓰레드 생성 방법

### 1. Thread 클래스 상속
```java
class MyThread extends Thread {
    @Override
    public void run() {
        // 실행할 코드
    }
}

MyThread t = new MyThread();
t.start();
```

### 2. Runnable 인터페이스 구현
```java
class MyTask implements Runnable {
    @Override
    public void run() {
        // 실행할 코드
    }
}

Thread t = new Thread(new MyTask());
t.start();
```

## 주요 메서드
- `start()`: 쓰레드 시작
- `run()`: 실행할 코드 정의
- `sleep(ms)`: 일정 시간 대기
- `join()`: 쓰레드 종료 대기
- `interrupt()`: 쓰레드 중단 요청

## 쓰레드 상태
- NEW: 생성됨
- RUNNABLE: 실행 가능
- BLOCKED: 락 대기
- WAITING: 대기
- TIMED_WAITING: 시간 지정 대기
- TERMINATED: 종료

## 동기화 (Synchronization)
- 공유 자원 접근 시 동시성 문제 해결
- `synchronized` 키워드 사용함
