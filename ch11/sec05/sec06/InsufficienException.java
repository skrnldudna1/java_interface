package src.ch11.sec05.sec06;

// 예외처리 , 사용자 정의

public class InsufficienException extends Exception {
    public InsufficienException() {

    }

    public InsufficienException(String message) {
        super(message);
    }
}
