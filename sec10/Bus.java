package src.sec10;

public class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    //추가 메소드
    public void checkFare() {
        System.out.println("승차 요금을 체그합니다.");
    }
}
