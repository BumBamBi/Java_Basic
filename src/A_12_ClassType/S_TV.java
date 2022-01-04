package A_12_ClassType;

public class S_TV extends TV {
    @Override
    public void powerOff() {
        System.out.println("S - PowerOff");        
    }

    @Override
    public void powerOn() {
        System.out.println("S - powerOn");   
    }

    @Override
    public void volumeDown() {
        System.out.println("S - volumeDown");   
    }

    @Override
    public void volumeUp() {
        System.out.println("S - volumeUp");   
    }
}
