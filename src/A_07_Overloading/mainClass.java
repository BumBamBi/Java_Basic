package A_07_Overloading;

public class mainClass {
    // Overloading
    // 메서드의 중복정의 가능
    // 매개변수의 개수 및 타입과 매개변수의 순서, 형변환된 여부에 의해 가능
    // 생성자도 Ovrloading가능
    public static void main(String args[]){
        Employee E1 = new Employee();

        E1.print_type();
        E1.print_type("string");
        E1.print_type(0);
    }
}
