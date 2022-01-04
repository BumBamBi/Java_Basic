package A_12_ClassType;

public class L_TV extends TV {
    @Override
    public void powerOff() {
        System.out.println("L - PowerOff");        
    }

    @Override
    public void powerOn() {
        System.out.println("L - powerOn");   
    }

    @Override
    public void volumeDown() {
        System.out.println("L - volumeDown");   
    }

    @Override
    public void volumeUp() {
        System.out.println("L - volumeUp");   
    }
}
