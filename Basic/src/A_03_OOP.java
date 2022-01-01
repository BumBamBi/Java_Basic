public class A_03_OOP {
    public static void main(String[] args) throws Exception {
        // 객체 생성
        A_03_OOP_car mycar = new A_03_OOP_car();
        
        // set
        mycar.setCarName("LEE");
        String carName = mycar.getCarName();
        
        // 출력
        System.out.println(carName);

        /* ------------------------------------------------- */
        // 상속
        A_03_OOP_car_taxi mytaxi = new A_03_OOP_car_taxi();
        
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