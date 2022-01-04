package A_10_Abstract;

public class mainClass {
    // 추상 클래스
    // 추상 클래스는 객체생성 불가
    // 상속과 연관되어 사용
    // 필수로 Overriding해서 사용해야하는 메서드가 있다는거 알려줌.

    public static void main(String args[]){
        S_TV tv1 = new S_TV();
        tv1.powerOn();
        tv1.powerOn();
        tv1.volumeUp();
        tv1.volumeDown();
    }
}
