package src.sec06;

public class SmartTelevision implements Remotecontrol,Sarchable{
    @Override
    public void turnOn() {
        System.out.println("Tv를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 킵니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다.");
    }
}
