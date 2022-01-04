package A_10_Abstract;

public class S_TV extends TV {

    // 추상 클래스를 상속받으면, 필수로 Overriding 해야 오류가 나지 않음.


    @Override
    public void powerOff() {
        System.out.println("PowerOff");        
    }

    @Override
    public void powerOn() {
        System.out.println("powerOn");   
    }

    @Override
    public void volumeDown() {
        System.out.println("volumeDown");   
    }

    @Override
    public void volumeUp() {
        System.out.println("volumeUp");   
    }
    
}
