package A_12_ClassType;

public class mainClass {
    public static void main(String args[]){
        // 인자를 판별해주는 객체를 만들어서
        // S면 S TV, L이면 LTV가 리턴되도록 함
        TVFactory factory = new TVFactory();
        TV tv = factory.getTV("S");
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
    }
}
