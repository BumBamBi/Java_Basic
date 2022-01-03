package A_04_public_private;
public class mainClass {
    public String name;
    private int SSN;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSSN() {
        return SSN;
    }
    public void setSSN(int sSN) {
        SSN = sSN;
    }
}