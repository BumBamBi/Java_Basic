package A_03_OOP;
public class mainClass {
    public static void main(String[] args) throws Exception {
        // 객체 생성
        car mycar = new car();
        
        // set
        mycar.setCarName("LEE");
        String carName = mycar.getCarName();
        
        // 출력
        System.out.println(carName);

        /* ------------------------------------------------- */
        // 상속
        taxi mytaxi = new taxi();
        
        // set
        mytaxi.setFare(1000);
        int taxiFare = mytaxi.getFare();

        mytaxi.setCarName("YOO");
        String taxiName = mytaxi.getCarName();

        // 출력
        System.out.println(taxiFare);
        System.out.println(taxiName);
        


    }
}