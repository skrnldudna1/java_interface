package src.ch11.sec05;

//throw 키워드를 사용한 예외처리

public class ThrowsExam {
    public static void main(String[] args) {

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 :" + e.toString());                  //호출한 곳에서 예외 처리
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
