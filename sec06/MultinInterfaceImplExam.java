package src.sec06;

public class MultinInterfaceImplExam {
    public static void main(String[] args) {

        Remotecontrol rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        Sarchable sarchable = new SmartTelevision();
        sarchable.search("http://www.youtube.com");
    }
}
